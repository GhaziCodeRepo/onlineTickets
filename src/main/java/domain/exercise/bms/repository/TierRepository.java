package domain.exercise.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Tier;

@Repository
public interface TierRepository extends JpaRepository<Tier, Long> {
    // You can add custom query methods if needed
}
