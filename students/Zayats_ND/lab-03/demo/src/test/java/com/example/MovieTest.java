package com.example;

import com.model.Movie;
import com.value_objects.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void shouldCreateMovie() {
        Movie m = new Movie(
                1L,
                new MovieTitle("Test"),
                new Genre("ACTION"),
                new Rating(8),
                new Description("Nice")
        );

        assertNotNull(m);
        assertEquals("Test", m.getTitle().value());
        assertEquals(new Genre("ACTION"), m.getGenre());
        assertEquals(8, m.getRating().value());
        assertFalse(m.getEvents().isEmpty());
    }

    @Test
    void shouldContainMovieCreatedEvent() {
        Movie m = new Movie(
                2L,
                new MovieTitle("Inception"),
                new Genre("ACTION"),
                new Rating(9),
                new Description("Dreams")
        );

        assertEquals(1, m.getEvents().size());
        assertTrue(
                m.getEvents().stream()
                        .anyMatch(e -> e.getClass().getSimpleName().equals("MovieCreatedEvent"))
        );
    }

    @Test
    void shouldHaveCorrectId() {
        Movie m = new Movie(
                10L,
                new MovieTitle("Avatar"),
                new Genre("SCI_FI"),
                new Rating(7),
                new Description("Blue people")
        );

        assertEquals(10L, m.getId());
    }

    @Test
    void shouldNotAllowNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Movie(
                    null,
                    new MovieTitle("Bad"),
                    new Genre("ACTION"),
                    new Rating(5),
                    new Description("Fail")
            );
        });
    }
}