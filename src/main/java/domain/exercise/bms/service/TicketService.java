package domain.exercise.bms.service;

import java.time.LocalDate;
import java.util.List;

import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.model.Ticket;

public interface TicketService {
    List<Ticket> bookUserSelectedSeat(Long eventId, Long locationId, Long showTimeId, List<Integer> seats);
    // Add more methods based on your requirements
    List<Ticket> getUserTickets(Long userId);
    public List<ShowTiming> 
    getTheatresAndShowsByTownAndMovie(String town, Long movieId, String date) ;
}
