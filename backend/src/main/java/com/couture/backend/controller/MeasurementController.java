package com.couture.backend.controller;

import java.util.List;
import com.couture.backend.entity.Measurement;
import com.couture.backend.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/measurement")
@CrossOrigin
public class MeasurementController {

    @Autowired
    private MeasurementRepository repo;

    // Save measurement
    @PostMapping
    public Measurement save(@RequestBody Measurement m) {
        return repo.save(m);
    }

    // Get measurement by userId
    @GetMapping("/{userId}")
    public List<Measurement> getAll(@PathVariable Long userId) {
        return repo.findByUserIdOrderByIdDesc(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteMeasurement(@PathVariable Long id) {
        repo.deleteById(id);
    }
}