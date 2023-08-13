package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.exercise.bms.model.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
    // You can add custom query methods if needed
}
