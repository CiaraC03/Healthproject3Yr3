package ie.atu.healthproject3;

import org.springframework.stereotype.Service;

@Service
public class MedicalRecordsService {
    private final MedicalRecordsRepository medicalRecordsRepository;


    public MedicalRecordsService(MedicalRecordsRepository medicalRecordsRepository) {
        this.medicalRecordsRepository = medicalRecordsRepository;
    }

    public void saveMedicalRecords(MedicalRecords medicalRecords)
    {
        medicalRecordsRepository.save(medicalRecords);
    }
    public MedicalRecords getMedicalRecordsByPatientId(String patientId)
    {
        return medicalRecordsRepository.findByPatientId(patientId);
    }
}
