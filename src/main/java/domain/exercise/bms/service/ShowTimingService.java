package domain.exercise.bms.service;

import java.util.List;

import domain.exercise.bms.model.ShowTiming;

public interface ShowTimingService {
    List<ShowTiming> getShowTimings(Long eventId, Long locationId);
    // Add more methods based on your requirements

	List<ShowTiming> getShowTimings(String town, Long movieId, String date);
}
