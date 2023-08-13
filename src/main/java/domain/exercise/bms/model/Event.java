package domain.exercise.bms.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "event_id")
	    private Long eventId;

	 	@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "movie_id")
	    private Movie movie;

	 	@ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "location_id")
	    private Place location;

	    @Column(name = "event_date")
	    private Timestamp eventDate;

	    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
	    private List<ShowTiming> showTimings;
}
