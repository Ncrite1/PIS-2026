package com.example.e2e.flow;

import com.example.command.CreateMovieCommand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieFlowE2ETest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void fullFlow() {

        CreateMovieCommand cmd = new CreateMovieCommand(
                "Dune",
                "SCI_FI",
                8.5,
                "Desert planet"
        );

        ResponseEntity<Void> response =
                restTemplate.postForEntity("/api/movies", cmd, Void.class);

        assertEquals(200, response.getStatusCode().value());
    }
}