package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.SeatReservation;

@Repository
public interface SeatReservationRepository extends JpaRepository<SeatReservation, Long> {
    // You can add custom query methods if needed
}
