package com.couture.backend.repository;

import com.couture.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByPhoneOrderByIdDesc(String phone);
}