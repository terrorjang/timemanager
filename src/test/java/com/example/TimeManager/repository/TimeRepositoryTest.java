package com.example.TimeManager.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class TimeRepositoryTest {

    @Autowired
    TimeRepository timeRepository;
    @Test
    public void save() {
        Time time = Time.builder()
                .group("test")
                .subject("test")
                .date(LocalDateTime.now())
                .duration(Duration.ofMinutes(19))
                .build();

        Time savedTime= timeRepository.save(time);
        assertThat(savedTime).isEqualTo(time);
    }
}
