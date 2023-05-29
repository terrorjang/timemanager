package com.example.TimeManager.controller;

import com.example.TimeManager.domain.Time;
import com.example.TimeManager.repository.TimeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(value = "/api/v1")
@RestController
public class TimeManagerApiController {
    private TimeRepository timeRepository;

    public TimeManagerApiController(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @GetMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/times/{id}")
    public ResponseEntity<Time> findById(@PathVariable Long id) {
        Optional<Time> time = timeRepository.findById(id);

        if (time.isPresent()) {
            return ResponseEntity.ok(time.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }
}
