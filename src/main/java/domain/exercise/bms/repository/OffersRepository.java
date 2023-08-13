package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Offers;

@Repository
public interface OffersRepository extends JpaRepository<Offers, Long> {
    // You can add custom query methods if needed
}
