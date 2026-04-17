package com.couture.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/measurements")
@CrossOrigin(origins = "*")
public class MeasurementController {

    private List<Map<String, Object>> measurements = new ArrayList<>();

    @PostMapping
    public Map<String, Object> saveMeasurement(@RequestBody Map<String, Object> body) {

        body.put("id", measurements.size() + 1);
        measurements.add(body);

        return body;
    }

    @GetMapping("/{userId}")
    public List<Map<String, Object>> getMeasurements(@PathVariable int userId) {
        return measurements;
    }
}