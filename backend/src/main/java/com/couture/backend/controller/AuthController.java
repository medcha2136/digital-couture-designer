package com.couture.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

   @PostMapping("/login")
public Map<String, Object> login(@RequestBody Map<String, String> body) {

    String phone = body.get("phone");

    Map<String, Object> response = new HashMap<>();
    response.put("id", 1);
    response.put("phone", phone);

    return response;
}

    @GetMapping("/send-otp")
    public String sendOtp(@RequestParam String phone) {
        return "OTP sent to " + phone;
    }

    @GetMapping("/verify-otp")
    public String verifyOtp(@RequestParam String phone,
                            @RequestParam String otp) {
        return "OTP verified";
    }
}