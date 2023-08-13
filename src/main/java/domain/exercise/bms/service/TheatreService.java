package domain.exercise.bms.service;

import java.util.List;
import java.util.Set;

import domain.exercise.bms.model.ShowTimeDTO;
import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.model.Theatre;
import domain.exercise.bms.model.TheatreDTO;

public interface TheatreService {
    List<Theatre> getAllTheatres();
    Theatre getTheatreById(Long id);
    Theatre createTheatre(Theatre theatre);
    Theatre updateTheatre(Long id, Theatre theatre);
    boolean deleteTheatre(Long id);
    List<Theatre> getTheatresByLocationAndEvent(Long cityId, Long eventId);
	List<ShowTiming> getTheatresAndShowsByTownAndMovie(String town, Long movieId, String date);

    String addShowTiming(Long theatreId, ShowTimeDTO showTiming);
    ShowTimeDTO updateShowTiming(
    		Long theatreId, Long showTimingId, ShowTimeDTO updatedShowTimeDTO);
    void deleteShowTiming(Long theatreId, Long showTimingId);
	Set<TheatreDTO> findTheatresRunningMovieInTownByDate(String town, Long movieId, String chosenDate);

}
