package com.example.TimeManager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/v1")
@RestController
public class TimeManagerApiController {
    @GetMapping("/")
    public String home() {
        return "Home";
    }
}
