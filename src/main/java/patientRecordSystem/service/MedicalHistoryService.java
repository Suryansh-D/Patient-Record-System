package patientRecordSystem.service;

import org.springframework.stereotype.Service;
import patientRecordSystem.models.MedicalHistory;
import patientRecordSystem.repositories.MedicalHistoryRepository;

@Service
public class MedicalHistoryService {
    private final MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    public MedicalHistory getMedicalHistoryById(Long medicalHistoryId) {
        return medicalHistoryRepository.findById(medicalHistoryId).orElseThrow(() -> new RuntimeException("Medical History not found"));
    }

    public MedicalHistory addOrUpdateMedicalHistory(MedicalHistory medicalHistory) {
        return medicalHistoryRepository.save(medicalHistory);
    }

    public void deleteMedicalHistoryById(Long medicalHistoryId) {
        medicalHistoryRepository.deleteById(medicalHistoryId);
    }
}


//
//@Service
//public class PatientService {
//
//    private final PatientRepository patientRepository;
//
//    @Autowired
//    public PatientService(PatientRepository patientRepository) {
//        this.patientRepository = patientRepository;
//    }
//
//    public Patient addorpdatePatient(Patient patient) {
//        return patientRepository.save(patient);
//    }
//
//    public Patient getPatientById(Long patientId) {
//        Optional<Patient> optionalPatient = patientRepository.findById(patientId);
//        if(optionalPatient.isEmpty()){
//            throw new RuntimeException("Patient not found");
//        }
//        return optionalPatient.get();
//    }
//
//    public void deletePatientById(Long patientId) {
//        patientRepository.deleteById(patientId);
//    }
//}