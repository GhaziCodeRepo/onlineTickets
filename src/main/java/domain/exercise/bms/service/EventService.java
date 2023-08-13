package domain.exercise.bms.service;

import java.util.List;
import domain.exercise.bms.model.Event;

public interface EventService {
    List<Event> getEventsByLocationAndCity(Long cityId, Long locationId);
    // Add more methods based on your requirements
}
