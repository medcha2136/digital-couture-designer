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

    // ✅ Helper method for String validation
    private boolean isInvalid(String v) {
        return v == null || v.trim().isEmpty();
    }

    // ✅ Save measurement
    @PostMapping
    public Measurement save(@RequestBody Measurement m) {

        // Check user
        if (m.getUserId() == null) {
            throw new RuntimeException("User ID missing");
        }

        // At least one important field required
        if (
            isInvalid(m.getChestBust()) &&
            isInvalid(m.getWaistUpper()) &&
            isInvalid(m.getHipUpper())
        ) {
            throw new RuntimeException("At least one valid measurement required");
        }

        return repo.save(m);
    }

    // ✅ Get measurements
    @GetMapping("/{userId}")
    public List<Measurement> getAll(@PathVariable Long userId) {
        return repo.findByUserIdOrderByIdDesc(userId);
    }

    // ✅ Delete measurement
    @DeleteMapping("/{id}")
    public void deleteMeasurement(@PathVariable Long id) {
        repo.deleteById(id);
    }
}