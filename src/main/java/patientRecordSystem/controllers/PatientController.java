package patientRecordSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import patientRecordSystem.models.Patient;
import patientRecordSystem.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addorUpdatePatient(patient);
    }

//    @GetMapping("/{patientId}")
//    public ResponseEntity<Patient> getPatientById(@PathVariable Long patientId) {
//        Patient patient = null;
//
//        patient = patientService.getPatientById(patientId);
//        ResponseEntity<Patient> responseEntity = new ResponseEntity<>(patient, HttpStatus.OK);
//        return responseEntity;
//    }
}