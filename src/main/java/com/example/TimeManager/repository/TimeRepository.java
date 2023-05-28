package com.example.TimeManager.repository;

import com.example.TimeManager.domain.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TimeRepository extends CrudRepository<Time, Long> {
}
