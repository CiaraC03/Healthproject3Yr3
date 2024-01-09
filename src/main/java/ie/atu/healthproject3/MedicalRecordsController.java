package ie.atu.healthproject3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/medicalRecords")
@RestController
public class MedicalRecordsController {
    private final MedicalRecordsService medicalRecordsService;

    public MedicalRecordsController(MedicalRecordsService medicalRecordsService) {
        this.medicalRecordsService = medicalRecordsService;
    }

    @GetMapping("/medicalRecords/{patientId}")
    public ResponseEntity<?> getMedicalRecordsByPatientId(@PathVariable String patientId)
    {
        MedicalRecords medicalRecords = medicalRecordsService.getMedicalRecordsByPatientId(patientId);
        return ResponseEntity.ok(medicalRecords);

    }

    @PostMapping("/createMedicalRecords")
    public ResponseEntity<String>create(MedicalRecords medicalRecords)
    {
        medicalRecordsService.saveMedicalRecords(medicalRecords);
        return new ResponseEntity<>("Medical records created successfully", HttpStatus.OK);
    }
}
