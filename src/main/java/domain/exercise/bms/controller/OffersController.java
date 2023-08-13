package domain.exercise.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import domain.exercise.bms.model.Offers;
import domain.exercise.bms.service.OffersService;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class OffersController {

    private final OffersService offersService;

    @Autowired
    public OffersController(OffersService offersService) {
        this.offersService = offersService;
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<List<Offers>> getOffersByMovie(@PathVariable Long movieId) {
        List<Offers> offers = offersService.getOffersByMovie(movieId);
        return ResponseEntity.ok(offers);
    }

    // Add more mapping methods as needed
}
