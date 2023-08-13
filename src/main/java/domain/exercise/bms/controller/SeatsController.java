package domain.exercise.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import domain.exercise.bms.model.Seats;
import domain.exercise.bms.service.SeatsService;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatsController {

    private final SeatsService seatsService;

    @Autowired
    public SeatsController(SeatsService seatsService) {
        this.seatsService = seatsService;
    }

    @GetMapping("/available")
    public ResponseEntity<List<Seats>> getAvailableSeats(
            @RequestParam Long eventId,
            @RequestParam Long locationId,
            @RequestParam Long showTimeId) {
        List<Seats> availableSeats = seatsService.getAvailableSeats(eventId, locationId, showTimeId);
        return ResponseEntity.ok(availableSeats);
    }

    @PostMapping("/verify")
    public ResponseEntity<Boolean> verifyUserSelectedSeatsAvailable(
            @RequestParam Long eventId,
            @RequestParam Long locationId,
            @RequestParam Long showTimeId,
            @RequestBody List<Integer> seats) {
        boolean seatsAvailable = seatsService.verifyUserSelectedSeatsAvailable(eventId, locationId, showTimeId, seats);
        return ResponseEntity.ok(seatsAvailable);
    }

    // Add more mapping methods as needed
}
