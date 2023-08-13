package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.Offers;

public interface OffersService {
    List<Offers> getOffersByMovie(Long movieId);
    // Add more methods based on your requirements
}
