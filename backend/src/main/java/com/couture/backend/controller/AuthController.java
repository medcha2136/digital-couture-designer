package com.couture.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

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