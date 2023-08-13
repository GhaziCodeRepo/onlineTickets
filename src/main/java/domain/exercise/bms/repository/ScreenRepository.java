package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Screen;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {
    // You can add custom query methods if needed
}
