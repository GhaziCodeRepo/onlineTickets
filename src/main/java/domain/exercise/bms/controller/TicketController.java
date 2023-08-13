package domain.exercise.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.exercise.bms.model.Ticket;
import domain.exercise.bms.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Ticket>> getUserTickets(@PathVariable Long userId) {
        List<Ticket> userTickets = ticketService.getUserTickets(userId);
        return ResponseEntity.ok(userTickets);
    }

	/*
	 * @PostMapping public ResponseEntity<Ticket> bookUserSelectedSeat(@RequestBody
	 * Ticket ticket) { Ticket bookedTicket =
	 * ticketService.bookUserSelectedSeat(ticket); return new
	 * ResponseEntity<>(bookedTicket, HttpStatus.CREATED); }
	 */
    
    @PostMapping("/book")
    public ResponseEntity<List<Ticket>> bookUserSelectedSeat(
            @RequestParam Long eventId,
            @RequestParam Long locationId,
            @RequestParam Long showTimeId,
            @RequestBody List<Integer> seats) {
        List<Ticket> bookedTickets = ticketService.bookUserSelectedSeat(eventId, locationId, showTimeId, seats);
        return new ResponseEntity<>(bookedTickets, HttpStatus.CREATED);
    }


    // Add more mapping methods as needed
}
