package com.couture.backend.repository;

import java.util.List;
import com.couture.backend.entity.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

    // Get measurement for a specific user

    List<Measurement> findByUserIdOrderByIdDesc(Long userId);
}