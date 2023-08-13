package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.Seats;

public interface SeatsService {
    List<Seats> getAvailableSeats(Long eventId, Long locationId, Long showTimeId);
    boolean verifyUserSelectedSeatsAvailable(Long eventId, Long locationId, Long showTimeId, List<Integer> seats);
    // Add more methods based on your requirements
}
