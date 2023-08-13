package domain.exercise.bms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.exercise.bms.model.Offers;
import domain.exercise.bms.repository.OffersRepository;
import domain.exercise.bms.service.OffersService;

@Service
public class OffersServiceImpl implements OffersService {

    private final OffersRepository offersRepository;

    @Autowired
    public OffersServiceImpl(OffersRepository offersRepository) {
        this.offersRepository = offersRepository;
    }

    @Override
    public List<Offers> getOffersByMovie(Long movieId) {
		return null;
        // Implement logic to get offers by movieId
    }

    // Implement other methods as needed
}
