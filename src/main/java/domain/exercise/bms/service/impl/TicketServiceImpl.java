package domain.exercise.bms.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.model.Ticket;
import domain.exercise.bms.repository.TicketRepository;
import domain.exercise.bms.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> bookUserSelectedSeat(Long eventId, Long locationId, Long showTimeId, List<Integer> seats) {
		return null;
        // Implement logic to book user-selected seats
    }

	@Override
	public List<Ticket> getUserTickets(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShowTiming> getTheatresAndShowsByTownAndMovie(String town, Long movieId, String date) {
		// TODO Auto-generated method stub
		return null;
	}

    // Implement other methods as needed
}
