package domain.exercise.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.service.ShowTimingService;

@RestController
@RequestMapping("/api/showtimings")
public class ShowTimingController {

    private final ShowTimingService showTimingService;

    @Autowired
    public ShowTimingController(ShowTimingService showTimingService) {
        this.showTimingService = showTimingService;
    }

    @GetMapping("/event/{eventId}/{locationId}")
    public ResponseEntity<List<ShowTiming>> getShowTimings(
            @PathVariable Long eventId,
            @PathVariable Long locationId) {
        List<ShowTiming> showTimings = showTimingService.getShowTimings(eventId, locationId);
        return ResponseEntity.ok(showTimings);
    }

    // Add more mapping methods as needed
}
