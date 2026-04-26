package com.example;

import com.model.Recommendation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecommendationTest {

    @Test
    void createRecommendation() {
        Recommendation r = new Recommendation(1L, 2L, 3L, "Good");

        assertNotNull(r);
        assertFalse(r.getEvents().isEmpty());
    }
}