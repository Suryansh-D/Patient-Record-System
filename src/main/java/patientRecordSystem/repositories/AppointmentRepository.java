package patientRecordSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import patientRecordSystem.models.Appointment;

import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Override
    Optional<Appointment> findById(Long aLong);

    @Override
    Appointment save(Appointment appointment);

    @Override
    void deleteById(Long aLong);
}
