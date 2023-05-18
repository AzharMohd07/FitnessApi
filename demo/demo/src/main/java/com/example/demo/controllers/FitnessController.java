package com.example.demo.controllers;

import com.example.demo.entity.Fitness;
import com.example.demo.service.FitnessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FitnessController {

    private final FitnessService fitnessService;
    public FitnessController(FitnessService fitnessService) {
        this.fitnessService = fitnessService;
    }

    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/fitness")
    public ResponseEntity<Fitness> createFitness(@RequestBody Fitness fitness) {
        Fitness createdFitness = fitnessService.createFitness(fitness);
        return ResponseEntity.ok(createdFitness);
    }

    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/latest")
    public ResponseEntity<Fitness> getLatestFitness() {
        Fitness latestFitness = fitnessService.getLatestFitness();
        return ResponseEntity.ok(latestFitness);
    }

    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/fit")
    public ResponseEntity<List<Fitness>> getAllFitness() {
        List<Fitness> latestFitness = fitnessService.getAllFitness();
        return ResponseEntity.ok(latestFitness);
    }

    //@PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/fit/{id}")
    public ResponseEntity<Fitness> getFitnessById(@PathVariable("id") Long fitnessId) {

        Fitness fitness = fitnessService.getFitnessById(fitnessId);
        return new ResponseEntity<>(fitness, HttpStatus.OK);
    }


    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/fit/{id}")
    public ResponseEntity<Fitness> updateFitness(@PathVariable("id") Long fitnessId, @RequestBody Fitness report) {
        Fitness updatedReport = this.fitnessService.updateFitness(fitnessId, report);
        return new ResponseEntity<>(updatedReport, HttpStatus.OK);
    }
    //@PreAuthorize("hasRole('ADMIN','USER')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFitness(@PathVariable("id") Long fitnessId) {
        fitnessService.deleteFitness(fitnessId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
