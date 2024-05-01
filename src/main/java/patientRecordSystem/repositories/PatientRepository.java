package patientRecordSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import patientRecordSystem.models.Patient;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    @Override
    Optional<Patient> findById(Long aLong);

    @Override
    Patient save(Patient patient);

    @Override
    void deleteById(Long aLong);
}
