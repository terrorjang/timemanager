package com.example.TimeManager.repository;

import com.example.TimeManager.domain.Time;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.*;

//@TestPropertySource(locations = "classpath:application-test.properties")
@SpringBootTest
public class TimeRepositoryTest {

    @Autowired
    TimeRepository timeRepository;

    @Test
    public void save() {
        Time time = Time.builder()
                .groupName("test")
                .subject("test")
                .date(LocalDateTime.now())
                .duration(Duration.ofMinutes(19))
                .build();

        Time savedTime = timeRepository.save(time);
        assertThat(savedTime).isEqualTo(time);
    }
}
