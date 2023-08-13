package domain.exercise.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import domain.exercise.bms.model.Tier;
import domain.exercise.bms.service.TierService;

import java.util.List;

@RestController
@RequestMapping("/api/tiers")
public class TierController {

    private final TierService tierService;

    @Autowired
    public TierController(TierService tierService) {
        this.tierService = tierService;
    }

    @GetMapping("/screen/{screenId}")
    public ResponseEntity<List<Tier>> getTiersByScreen(@PathVariable Long screenId) {
        List<Tier> tiers = tierService.getTiersByScreen(screenId);
        return ResponseEntity.ok(tiers);
    }

	/*
	 * @GetMapping("/{id}") public ResponseEntity<Tier> getTierById(@PathVariable
	 * Long id) { Tier tier = tierService.getTierById(id); if (tier != null) {
	 * return ResponseEntity.ok(tier); } else { return
	 * ResponseEntity.notFound().build(); } }
	 * 
	 * @PostMapping public ResponseEntity<Tier> createTier(@RequestBody Tier tier) {
	 * Tier createdTier = tierService.createTier(tier); return new
	 * ResponseEntity<>(createdTier, HttpStatus.CREATED); }
	 * 
	 * @PutMapping("/{id}") public ResponseEntity<Tier> updateTier(@PathVariable
	 * Long id, @RequestBody Tier tier) { Tier updatedTier =
	 * tierService.updateTier(id, tier); if (updatedTier != null) { return
	 * ResponseEntity.ok(updatedTier); } else { return
	 * ResponseEntity.notFound().build(); } }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void> deleteTier(@PathVariable
	 * Long id) { boolean deleted = tierService.deleteTier(id); if (deleted) {
	 * return ResponseEntity.noContent().build(); } else { return
	 * ResponseEntity.notFound().build(); } }
	 */}
