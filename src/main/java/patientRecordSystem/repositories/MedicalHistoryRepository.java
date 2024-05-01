package patientRecordSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import patientRecordSystem.models.MedicalHistory;

import java.util.Optional;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory,Long> {

    @Override
    Optional<MedicalHistory> findById(Long aLong);

    @Override
    MedicalHistory save(MedicalHistory medicalHistory);

    @Override
    void deleteById(Long aLong);
}
