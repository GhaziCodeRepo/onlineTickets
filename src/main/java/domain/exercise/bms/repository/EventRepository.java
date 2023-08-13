package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // You can add custom query methods if needed
}
