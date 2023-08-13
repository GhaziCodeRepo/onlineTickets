package domain.exercise.bms.model;

import java.math.BigDecimal;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "offers")
public class Offers {
    @Id
    @Column(name = "offer_id")
    private Long offerId;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column(name = "discount_percent")
    private BigDecimal discountPercent;

    @Column(name = "offer_description")
    private String offerDescription;
}
