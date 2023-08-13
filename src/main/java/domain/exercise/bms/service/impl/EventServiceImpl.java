package domain.exercise.bms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.exercise.bms.model.Event;
import domain.exercise.bms.repository.EventRepository;
import domain.exercise.bms.service.EventService;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEventsByLocationAndCity(Long cityId, Long locationId) {
		return null;
        // Implement logic to get events by location and city
    }

    // Implement other methods as needed
}
