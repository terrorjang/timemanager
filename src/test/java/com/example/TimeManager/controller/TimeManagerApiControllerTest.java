package com.example.TimeManager.controller;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TimeManagerApiControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void shouldReturnATimeWhenDataIsSaved() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/api/v1/times/99", String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        DocumentContext documentContext = JsonPath.parse(response.getBody());

        Number id = documentContext.read("$.id");
        assertThat(id).isEqualTo(99);

        String subject = documentContext.read("$.subject");
        assertThat(subject).isEqualTo("test");

        String groupName = documentContext.read("$.groupName");
        assertThat(groupName).isEqualTo("group");
    }

}