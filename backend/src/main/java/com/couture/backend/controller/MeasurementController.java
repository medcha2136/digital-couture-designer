package com.couture.backend.controller;

import com.couture.backend.entity.Measurement;
import com.couture.backend.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/measurements")
@CrossOrigin(origins = "*")
public class MeasurementController {

    @Autowired
    private MeasurementRepository repo;

    @PostMapping
    public Measurement saveMeasurement(@RequestBody Measurement m) {
        return repo.save(m);
    }

    @GetMapping
    public java.util.List<Measurement> getAllMeasurements() {
        return repo.findAll();
    }
}