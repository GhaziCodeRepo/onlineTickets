package domain.exercise.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.exercise.bms.model.Event;
import domain.exercise.bms.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/location/{cityId}/{locationId}")
    public ResponseEntity<List<Event>> getEventsByLocationAndCity(
            @PathVariable Long cityId,
            @PathVariable Long locationId) {
        List<Event> events = eventService.getEventsByLocationAndCity(cityId, locationId);
        return ResponseEntity.ok(events);
    }

    // Add more mapping methods as needed
}
