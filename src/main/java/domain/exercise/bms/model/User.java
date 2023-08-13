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
@Table(name = "MOVIEUSER")
public class User {
    @Id
    @Column(name = "user_id")
    private Long userId;

    private String username;
    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "registration_date")
    private Timestamp registrationDate;
}
