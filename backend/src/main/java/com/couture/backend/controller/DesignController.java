package com.couture.backend.controller;

import com.couture.backend.entity.Design;
import com.couture.backend.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/design")
@CrossOrigin
public class DesignController {

    @Autowired
    private DesignRepository repo;

    // Save new design
    @PostMapping
    public Design saveDesign(@RequestBody Design design) {
        return repo.save(design);
    }

    // Get all designs of a user
    @GetMapping("/{userId}")
    public List<Design> getDesigns(@PathVariable Long userId) {
        return repo.findByUserId(userId);
    }
}