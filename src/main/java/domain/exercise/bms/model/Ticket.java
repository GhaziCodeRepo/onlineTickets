package domain.exercise.bms.model;

import java.sql.Timestamp;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticket_id")
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seats seat;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTiming showTiming;

    @Column(name = "booking_time")
    private Timestamp bookingTime;
}
