package com.example;

import com.domain.model.Movie;
import com.port.out.InMemoryMovieRepository;
import com.port.out.InMemoryWatchlistRepository;

import com.query.GetMovieQuery;
import com.query.GetUserRecommendationsQuery;
import com.query.GetWatchlistQuery;

import com.query.handler.GetMovieHandler;
import com.query.handler.GetUserRecommendationsHandler;
import com.query.handler.GetWatchlistHandler;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieQueryTest {

    @Test
    void shouldGetMovieById() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        Movie movie = repo.save(
                new Movie(null, null, null, null, null)
        );

        GetMovieHandler handler = new GetMovieHandler(repo);

        Movie result = handler.handle(new GetMovieQuery(movie.getId()));

        assertNotNull(result);
        assertEquals(movie.getId(), result.getId());
    }

    @Test
    void shouldReturnRecommendations() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        repo.save(new Movie(null, null, null, null, null));
        repo.save(new Movie(null, null, null, null, null));

        GetUserRecommendationsHandler handler =
                new GetUserRecommendationsHandler(repo);

        List<Movie> result =
                handler.handle(new GetUserRecommendationsQuery(1L));

        assertNotNull(result);
        assertTrue(result.size() >= 2);
    }

    @Test
    void shouldReturnEmptyWatchlist() {

        InMemoryWatchlistRepository watchlistRepo =
                new InMemoryWatchlistRepository();

        GetWatchlistHandler handler =
                new GetWatchlistHandler(watchlistRepo);

        List<Movie> result =
                handler.handle(new GetWatchlistQuery(1L));

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}