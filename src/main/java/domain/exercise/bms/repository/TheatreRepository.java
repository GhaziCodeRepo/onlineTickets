package domain.exercise.bms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import domain.exercise.bms.model.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {
    // You can add custom query methods if needed
	
	/*
	 * @Query(value = "SELECT t.* " + "FROM theatre t " +
	 * "JOIN place p ON t.place_id = p.place_id " +
	 * "JOIN event e ON e.location_id =  p.place_id " +
	 * "JOIN showtiming st ON st.event_id = e.event_id " + "WHERE p.name = :town " +
	 * "AND e.movie_id = :movieId " + "AND e.event_date = :chosenDate", nativeQuery
	 * = true) List<Theatre> findTheatresRunningMovieInTownByDate(
	 * 
	 * @Param("town") String town,
	 * 
	 * @Param("movieId") Long movieId,
	 * 
	 * @Param("chosenDate") String chosenDate);
	 */
	 
	 
	 @Query(value =  "SELECT t.* " + 
	 "FROM theatre t\r\n" + 
	 "JOIN place p ON t.place_id = p.place_id\r\n" + 
	 "WHERE p.name = :town \r\n" + 
	 "  AND t.theatre_id IN (\r\n" + 
	 "    SELECT t2.theatre_id\r\n" + 
	 "    FROM theatre t2\r\n" + 
	 "    JOIN place p2 ON t2.place_id = p2.place_id\r\n" + 
	 "    JOIN event e ON e.location_id = p2.place_id\r\n" + 
	 "    JOIN showtiming st ON st.event_id = e.event_id\r\n" + 
	 "    WHERE e.movie_id = :movieId \r\n" + 
	 "      AND e.event_date =  :chosenDate \r\n" + 
	 "  )",
      nativeQuery = true)
	    List<Theatre> findTheatresRunningMovieInTownByDate(
	        @Param("town") String town,
	        @Param("movieId") Long movieId,
	        @Param("chosenDate") String chosenDate);
}
