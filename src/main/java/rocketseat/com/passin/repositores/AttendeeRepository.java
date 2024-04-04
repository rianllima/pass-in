package rocketseat.com.passin.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
