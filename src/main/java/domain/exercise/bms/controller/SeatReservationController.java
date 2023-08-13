package domain.exercise.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.exercise.bms.model.SeatReservation;
import domain.exercise.bms.service.SeatReservationService;

@RestController
@RequestMapping("/api/seatreservations")
public class SeatReservationController {

    private final SeatReservationService seatReservationService;

    @Autowired
    public SeatReservationController(SeatReservationService seatReservationService) {
        this.seatReservationService = seatReservationService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<SeatReservation>> getSeatReservationsByUser(@PathVariable Long userId) {
        List<SeatReservation> seatReservations = seatReservationService.getSeatReservationsByUser(userId);
        return ResponseEntity.ok(seatReservations);
    }

    // Add more mapping methods as needed
}
