package domain.exercise.bms.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "theatre")
public class Theatre {
    @Id
    @Column(name = "theatre_id")
    private Long theatreId;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;
    
    @OneToMany(mappedBy = "theatre", fetch = FetchType.EAGER)
    private List<ShowTiming> showTimings = new ArrayList<>();

	public List<ShowTiming> getShowTimings() {
		return showTimings;
	}

	public void setShowTimings(List<ShowTiming> showTimings) {
		this.showTimings = showTimings;
	}

	public Long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
}
