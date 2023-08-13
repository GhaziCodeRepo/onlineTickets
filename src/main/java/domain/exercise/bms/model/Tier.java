package domain.exercise.bms.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tier")
public class Tier {
    @Id
    @Column(name = "tier_id")
    private Long tierId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    private Screen screen;
}
