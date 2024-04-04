package rocketseat.com.passin.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.checkin.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
