package domain.exercise.bms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.exercise.bms.model.SeatReservation;
import domain.exercise.bms.repository.SeatReservationRepository;
import domain.exercise.bms.service.SeatReservationService;

@Service
public class SeatReservationServiceImpl implements SeatReservationService {

    private final SeatReservationRepository seatReservationRepository;

    @Autowired
    public SeatReservationServiceImpl(SeatReservationRepository seatReservationRepository) {
        this.seatReservationRepository = seatReservationRepository;
    }

    @Override
    public List<SeatReservation> getSeatReservationsByUser(Long userId) {
		return null;
        // Implement logic to get seat reservations by user
    }

    // Implement other methods as needed
}
