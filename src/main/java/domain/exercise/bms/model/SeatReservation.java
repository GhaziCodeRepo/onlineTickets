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
@Table(name = "seatreservation")
public class SeatReservation {
    @Id
    @Column(name = "reservation_id")
    private Long reservationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTiming showTiming;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seats seat;

    @Column(name = "reservation_time")
    private Timestamp reservationTime;
}
