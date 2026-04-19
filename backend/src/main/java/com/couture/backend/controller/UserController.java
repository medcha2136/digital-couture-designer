package com.couture.backend.controller;

import com.couture.backend.entity.User;
import com.couture.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/login")
    public User login(@RequestBody User user) {

        User existing = repo.findByPhone(user.getPhone());

        if (existing == null) {
            return repo.save(user); // create new user
        }

        return existing; // return existing user
    }
}