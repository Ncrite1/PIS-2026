package com.controllers;

import com.domain.model.Movie;
import com.query.GetWatchlistQuery;
import com.query.handler.GetWatchlistHandler;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/watchlist")
public class WatchlistController {

    private final GetWatchlistHandler handler;

    public WatchlistController(GetWatchlistHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/{userId}")
    public List<Movie> getWatchlist(@PathVariable Long userId) {
        return handler.handle(new GetWatchlistQuery(userId));
    }
}