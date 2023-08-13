package domain.exercise.bms.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "place")
public class Place {
    @Id
    @Column(name = "place_id")
    private Long placeId;

    private String name;

    @Column(name = "parent_place_id")
    private Long parentPlaceId;

    @Column(name = "place_type")
    private String placeType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
