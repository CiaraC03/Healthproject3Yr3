package ie.atu.healthproject3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pharmacy-service", url = "http://localhost:8083")
public interface MedicalRecordsClient {
    @PostMapping("/confirmPharmacy")
    String appointmentDetails(@RequestBody MedicalRecords medicalRecords);
}
