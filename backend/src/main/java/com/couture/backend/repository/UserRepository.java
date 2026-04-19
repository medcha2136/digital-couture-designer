package com.couture.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couture.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhone(String phone);
}