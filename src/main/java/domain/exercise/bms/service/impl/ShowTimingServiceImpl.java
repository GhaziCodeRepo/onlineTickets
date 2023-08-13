package domain.exercise.bms.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.repository.ShowTimingRepository;
import domain.exercise.bms.service.ShowTimingService;

@Service
public class ShowTimingServiceImpl implements ShowTimingService {

    private final ShowTimingRepository showTimingRepository;

    @Autowired
    public ShowTimingServiceImpl(ShowTimingRepository showTimingRepository) {
        this.showTimingRepository = showTimingRepository;
    }

    @Override
    public List<ShowTiming> getShowTimings(String town, Long movieId, String date) {
        List<ShowTiming> showTimings = showTimingRepository.findByTheatreLocationTownAndEventMovieIdAndEventEventDate(town, movieId, date);
        return showTimings;
    }

	@Override
	public List<ShowTiming> getShowTimings(Long eventId, Long locationId) {
		// TODO Auto-generated method stub
		return null;
	}

    // Implement other methods as needed
}
