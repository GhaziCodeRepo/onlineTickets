package domain.exercise.bms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.Tier;
import domain.exercise.bms.repository.TierRepository;
import domain.exercise.bms.service.TierService;

@Service
public class TierServiceImpl implements TierService {

    private final TierRepository tierRepository;

    @Autowired
    public TierServiceImpl(TierRepository tierRepository) {
        this.tierRepository = tierRepository;
    }

    @Override
    public List<Tier> getTiersByScreen(Long screenId) {
		return null;
        // Implement logic to get tiers by screenId
    }

    // Implement other methods as needed
}
