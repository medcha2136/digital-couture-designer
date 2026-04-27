package com.couture.backend.controller;

import com.couture.backend.entity.Order;
import com.couture.backend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderRepository repo;

    // Save order
    @PostMapping
    public Order save(@RequestBody Order order) {
        return repo.save(order);
    }

    // Get user orders
    @GetMapping("/{phone}")
    public List<Order> getOrders(@PathVariable String phone) {
        return repo.findByPhoneOrderByIdDesc(phone);
    }
}