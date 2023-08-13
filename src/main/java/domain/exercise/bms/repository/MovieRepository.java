package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // You can add custom query methods if needed
}
