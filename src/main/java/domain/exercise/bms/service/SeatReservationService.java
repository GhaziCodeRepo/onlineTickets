package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.SeatReservation;

public interface SeatReservationService {
    List<SeatReservation> getSeatReservationsByUser(Long userId);
    // Add more methods based on your requirements
}
