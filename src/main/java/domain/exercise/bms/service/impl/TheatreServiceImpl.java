package domain.exercise.bms.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.Event;
import domain.exercise.bms.model.ShowTimeDTO;
import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.model.Theatre;
import domain.exercise.bms.model.TheatreDTO;
import domain.exercise.bms.repository.EventRepository;
import domain.exercise.bms.repository.ShowTimingRepository;
import domain.exercise.bms.repository.TheatreRepository;
import domain.exercise.bms.service.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService {

    private final TheatreRepository theatreRepository;
    private final ShowTimingRepository showTimingRepository;
    private final EventRepository eventRepository;

   
    @Autowired
    public TheatreServiceImpl(ShowTimingRepository  showTimingRepository,TheatreRepository theatreRepository,EventRepository eventRepository) {
        this.theatreRepository = theatreRepository;
        this.showTimingRepository = showTimingRepository;
        this.eventRepository = eventRepository;


    }
   

    @Override
    public List<Theatre> getTheatresByLocationAndEvent(Long cityId, Long eventId) {
		return null;
        // Implement logic to get theatres by location and event
    }

	@Override
	public List<Theatre> getAllTheatres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre getTheatreById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre createTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Theatre updateTheatre(Long id, Theatre theatre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTheatre(Long id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<ShowTiming> getTheatresAndShowsByTownAndMovie(String town, Long movieId, String date) {
		// TODO Auto-generated method stub
        List<ShowTiming> showTimings = showTimingRepository.findByTheatreLocationTownAndEventMovieIdAndEventEventDate(town, movieId, date);
		/*
		 *  }
		 */
        return showTimings;
	}
	
	  @Override
	    public Set<TheatreDTO> findTheatresRunningMovieInTownByDate(String town, Long movieId, String chosenDate) {
	        
	        		List<Theatre> theatres = theatreRepository.findTheatresRunningMovieInTownByDate(town, movieId, chosenDate);
	        		Set<TheatreDTO> theatreDTOs = theatres.stream()
	        		        .map(theatre -> {
	        		            TheatreDTO theatreDTO = new TheatreDTO();
	        		            theatreDTO.setTheatreId(theatre.getTheatreId());
	        		            theatreDTO.setTown(theatre.getPlace().getName());

	        		            Set<ShowTimeDTO> showTimingDTOs = theatre.getShowTimings().stream()
	        		                    .map(showTiming -> {
	        		                        ShowTimeDTO showTimingDTO = new ShowTimeDTO();
	        		                        showTimingDTO.setShowtimeId(showTiming.getShowtimeId());
	        		                        showTimingDTO.setStartTime(showTiming.getStartTime().toString());
	        		                        showTimingDTO.setEndTime(showTiming.getEndTime().toString());
	        		                        return showTimingDTO;
	        		                    })
	        		                    .collect(Collectors.toSet());

	        		            theatreDTO.setShowTimings(showTimingDTOs);
	        		            return theatreDTO;
	        		        })
	        		        .collect(Collectors.toSet());
	        		return theatreDTOs;
	        		
	    }
	
	 @Override
	    public String addShowTiming(Long theatreId, ShowTimeDTO showTiming) {
		 
		 Long showtimeId = showTiming.getShowtimeId();
		 Long event = showTiming.getEventid();
		 //showTiming.get();
	        Theatre theatre = theatreRepository.findById(theatreId)
	                .orElseThrow(() -> new EntityNotFoundException("Theatre not found with id: " + theatreId));

	        ShowTiming showTime = new ShowTiming();
	        
	        Optional<Event> findById = eventRepository.findById(event);
	        showTime.setShowtimeId(showtimeId);
	        showTime.setEvent(findById.get());
	        showTime.setStartTime(Timestamp.valueOf(showTiming.getStartTime()));
	        showTime.setEndTime(Timestamp.valueOf(showTiming.getEndTime()));
	        showTime.setMovieId(showTiming.getMovieId());
	        showTime.setTheatre(theatre);
	        // Save the showTiming entity
	        ShowTiming save = showTimingRepository.save(showTime);
	        
	        return save.toString();

	        
	    }
	 
	 @Override
	    public ShowTimeDTO updateShowTiming(Long theatreId, Long showTimingId, ShowTimeDTO showTiming) {
	        Theatre theatre = theatreRepository.findById(theatreId)
	                .orElseThrow(() -> new EntityNotFoundException("Theatre not found with id: " + theatreId));

	        ShowTiming existingShowTiming = showTimingRepository.findById(showTimingId)
	                .orElseThrow(() -> new EntityNotFoundException("ShowTiming not found with id: " + showTimingId));

	        // Update fields of existingShowTiming with values from showTiming
	        existingShowTiming.setStartTime(Timestamp.valueOf(showTiming.getStartTime()));
	        existingShowTiming.setEndTime(Timestamp.valueOf(showTiming.getEndTime()));
	        ShowTiming save = showTimingRepository.save(existingShowTiming);
	        return null;
	    }

	    @Override
	    public void deleteShowTiming(Long theatreId, Long showTimingId) {
	        Theatre theatre = theatreRepository.findById(theatreId)
	                .orElseThrow(() -> new EntityNotFoundException("Theatre not found with id: " + theatreId));

	        ShowTiming showTiming = showTimingRepository.findById(showTimingId)
	                .orElseThrow(() -> new EntityNotFoundException("ShowTiming not found with id: " + showTimingId));

	        showTimingRepository.delete(showTiming);
	    }

    // Implement other methods as needed
}
