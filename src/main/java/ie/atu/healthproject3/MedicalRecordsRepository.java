package ie.atu.healthproject3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordsRepository  extends JpaRepository<MedicalRecords, Long> {
    MedicalRecords findByPatientId(String patientId);
}
