package domain.exercise.bms.model;

import java.util.Set;

public class TheatreDTO {

    private Long theatreId;
    private String theatreName;
    private String town;
    private Set<ShowTimeDTO> showTimings;
	public Long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public Set<ShowTimeDTO> getShowTimings() {
		return showTimings;
	}
	public void setShowTimings(Set<ShowTimeDTO> showTimingDTOs) {
		this.showTimings = showTimingDTOs;
	}

    // Constructors, getters, setters
}