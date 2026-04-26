package com.query.handler;

import java.util.ArrayList;
import java.util.List;
import com.port.out.WatchlistRepository;
import com.domain.model.Movie;
import com.query.*;


public class GetWatchlistHandler {

    private final WatchlistRepository watchlistRepository;

    public GetWatchlistHandler(WatchlistRepository watchlistRepository) {
        this.watchlistRepository = watchlistRepository;
    }

    public List<Movie> handle(GetWatchlistQuery query) {

        List<Movie> watchlist = watchlistRepository.findByUserId(query.getUserId());

        if (watchlist == null) {
            return new ArrayList<>();
        }

        return watchlist;
    }
}