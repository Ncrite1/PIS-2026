package com.example;

import com.model.Watchlist;
import com.value_objects.WatchlistEntryDate;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class WatchlistTest {

    @Test
    void addMovie() {
        Watchlist w = new Watchlist(1L, 10L);

        w.addMovie(5L, new WatchlistEntryDate(LocalDateTime.now()));

        assertEquals(1, w.getEvents().size());
    }
}