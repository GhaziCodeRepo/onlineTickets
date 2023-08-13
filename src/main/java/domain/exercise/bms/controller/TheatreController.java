package domain.exercise.bms.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.exercise.bms.model.ShowTimeDTO;
import domain.exercise.bms.model.ShowTiming;
import domain.exercise.bms.model.Theatre;
import domain.exercise.bms.model.TheatreDTO;
import domain.exercise.bms.service.TheatreService;

@RestController
@RequestMapping("/api/theatres")
public class TheatreController {

    private final TheatreService theatreService;


    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping
    public ResponseEntity<List<Theatre>> getAllTheatres() {
        List<Theatre> theatres = theatreService.getAllTheatres();
        return ResponseEntity.ok(theatres);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theatre> getTheatreById(@PathVariable Long id) {
        Theatre theatre = theatreService.getTheatreById(id);
        if (theatre != null) {
            return ResponseEntity.ok(theatre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Theatre> createTheatre(@RequestBody Theatre theatre) {
        Theatre createdTheatre = theatreService.createTheatre(theatre);
        return new ResponseEntity<>(createdTheatre, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Theatre> updateTheatre(@PathVariable Long id, @RequestBody Theatre theatre) {
        Theatre updatedTheatre = theatreService.updateTheatre(id, theatre);
        if (updatedTheatre != null) {
            return ResponseEntity.ok(updatedTheatre);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheatre(@PathVariable Long id) {
        boolean deleted = theatreService.deleteTheatre(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{town}/shows")
    public ResponseEntity<Set<TheatreDTO>> getTheatresRunningMovieByDate(
            @PathVariable String town,
            @RequestParam Long movieId,
            @RequestParam String chosenDate) {

        Set<TheatreDTO> theatres = theatreService.findTheatresRunningMovieInTownByDate(town, movieId, chosenDate);
        return ResponseEntity.ok(theatres);
    }
    
    @PostMapping("/{theatreId}/addShowTiming")
    public ResponseEntity<String> addShowTiming(
            @PathVariable Long theatreId,
            @RequestBody ShowTimeDTO showTiming) {
        String addedShowTiming = theatreService.addShowTiming(theatreId, showTiming);
        if(showTiming!=null) {
        	
        	return new ResponseEntity<>("addedShowTiming", HttpStatus.CREATED);
        }
        else {
        	return new ResponseEntity<>("Showtime not added", HttpStatus.NOT_IMPLEMENTED);
        }
    }
    
    @PutMapping("/{theatreId}/updateShowTiming/{showTimingId}")
    public ResponseEntity<ShowTimeDTO> updateShowTiming(
            @PathVariable Long theatreId,
            @PathVariable Long showTimingId,
            @RequestBody ShowTimeDTO updatedShowTimeDTO) {
        ShowTimeDTO updatedShowTiming = theatreService.updateShowTiming(theatreId, showTimingId, updatedShowTimeDTO);
        return ResponseEntity.ok(updatedShowTiming);
    }

    @DeleteMapping("/{theatreId}/deleteShowTiming/{showTimingId}")
    public ResponseEntity<Void> deleteShowTiming(
            @PathVariable Long theatreId,
            @PathVariable Long showTimingId) {
        theatreService.deleteShowTiming(theatreId, showTimingId);
        return ResponseEntity.noContent().build();
    }

}
