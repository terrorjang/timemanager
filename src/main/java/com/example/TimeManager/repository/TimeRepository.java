package com.example.TimeManager.repository;

import com.example.TimeManager.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}
