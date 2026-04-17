package com.couture.backend.repository;

import com.couture.backend.entity.Design;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DesignRepository extends JpaRepository<Design, Long> {
    List<Design> findByUserId(Long userId);
}