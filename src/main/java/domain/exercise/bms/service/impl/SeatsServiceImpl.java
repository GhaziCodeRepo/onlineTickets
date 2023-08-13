package domain.exercise.bms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.exercise.bms.model.Seats;
import domain.exercise.bms.repository.SeatsRepository;
import domain.exercise.bms.service.SeatsService;

@Service
public class SeatsServiceImpl implements SeatsService {

    private final SeatsRepository seatsRepository;

    @Autowired
    public SeatsServiceImpl(SeatsRepository seatsRepository) {
        this.seatsRepository = seatsRepository;
    }

    @Override
    public List<Seats> getAvailableSeats(Long eventId, Long locationId, Long showTimeId) {
		return null;
        // Implement logic to get available seats based on event, location, and showtime
    }

    @Override
    public boolean verifyUserSelectedSeatsAvailable(Long eventId, Long locationId, Long showTimeId, List<Integer> seats) {
		return false;
        // Implement logic to verify if user-selected seats are available
    }

    // Implement other methods as needed
}
