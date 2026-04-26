package com.service;

import com.query.GetWatchlistQuery;
import com.query.handler.GetWatchlistHandler;
import com.domain.model.Movie;

import java.util.List;

public class WatchlistService {

    private final GetWatchlistHandler handler;

    public WatchlistService(GetWatchlistHandler handler) {
        this.handler = handler;
    }

    public List<Movie> getWatchlist(Long userId) {
        return handler.handle(new GetWatchlistQuery(userId));
    }
}