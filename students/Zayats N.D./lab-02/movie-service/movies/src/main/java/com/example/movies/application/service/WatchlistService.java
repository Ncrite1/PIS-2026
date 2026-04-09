package com.example.movies.application.service;

import com.example.movies.application.port.in.AddToWatchlistUseCase;
import com.example.movies.application.port.in.AddToWatchlistCommand;
import com.example.movies.application.port.out.WatchlistRepository;
import com.example.movies.application.port.out.MovieRepository;
import com.example.movies.domain.model.Watchlist;
import com.example.movies.domain.model.Movie;

import java.util.ArrayList;

public class WatchlistService implements AddToWatchlistUseCase {

    private final WatchlistRepository watchlistRepository;
    private final MovieRepository movieRepository;

    public WatchlistService(WatchlistRepository watchlistRepository,
                            MovieRepository movieRepository) {
        this.watchlistRepository = watchlistRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void add(AddToWatchlistCommand command) {
        if (watchlistRepository.existsByUserIdAndMovieId(
                command.userId(), command.movieId())) {
            return; // идемпотентность
        }

        Movie movie = movieRepository.findById(command.movieId())
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        Watchlist watchlist = watchlistRepository.findByUserId(command.userId());

        if (watchlist == null) {
            watchlist = new Watchlist(command.userId(), new ArrayList<>());
        }

        watchlist.getMovies().add(movie);
        watchlistRepository.save(watchlist);
    }
}