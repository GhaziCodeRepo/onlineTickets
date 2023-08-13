package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.Tier;

public interface TierService {
    List<Tier> getTiersByScreen(Long screenId);
    // Add more methods based on your requirements
}
