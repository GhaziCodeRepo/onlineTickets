package domain.exercise.bms.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import domain.exercise.bms.model.ShowTiming;

@Repository
public interface ShowTimingRepository extends JpaRepository<ShowTiming, Long> {

    @Query(value = "SELECT st.* " +
            "FROM showtiming st " +
            "JOIN event e ON st.event_id = e.event_id " +
            "JOIN theatre t ON e.location_id = t.theatre_id " +
            "JOIN place p ON t.place_id = p.place_id " +
            "WHERE p.name = :town " +
            "AND e.movie_id = :movieId " +
            "AND e.event_date = :date",
    nativeQuery = true)
List<ShowTiming> findByTheatreLocationTownAndEventMovieIdAndEventEventDate(
 @Param("town") String town,
 @Param("movieId") Long movieId,
 @Param("date") String date);

    // You can add custom query methods if needed
}
