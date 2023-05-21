package com.example.repository;

import com.example.model.ThermodynamicsData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThermodynamicsRepository extends JpaRepository<ThermodynamicsData, Long> {
    // Custom query methods can be added here if needed
}
