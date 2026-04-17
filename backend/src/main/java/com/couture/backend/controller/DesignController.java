package com.couture.backend.controller;

import com.couture.backend.entity.Design;
import com.couture.backend.repository.DesignRepository;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/designs")
@CrossOrigin(origins = "*")
public class DesignController {

    private final DesignRepository repo;

    public DesignController(DesignRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Design save(@RequestBody Design design) {
        return repo.save(design);
    }

    @GetMapping("/{userId}")
    public List<Design> get(@PathVariable Long userId) {
        return repo.findByUserId(userId);
    }
}