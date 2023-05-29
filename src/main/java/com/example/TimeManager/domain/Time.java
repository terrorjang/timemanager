package com.example.TimeManager.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String groupName;
    private String subject;
    private LocalDateTime date;
    private Duration duration;

    @Builder
    public Time(long id, String groupName, String subject, LocalDateTime date, Duration duration) {
        this.id = id;
        this.groupName = groupName;
        this.subject = subject;
        this.date = date;
        this.duration = duration;
    }
}
