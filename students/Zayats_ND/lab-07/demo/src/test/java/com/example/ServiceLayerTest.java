package com.example;

import com.domain.model.Movie;
import com.port.out.InMemoryMovieRepository;
import com.port.out.InMemoryWatchlistRepository;

import com.query.handler.GetMovieHandler;
import com.query.handler.GetUserRecommendationsHandler;
import com.query.handler.GetWatchlistHandler;

import com.service.MovieService;
import com.service.RecommendationService;
import com.service.WatchlistService;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceLayerTest {

    @Test
    void shouldReturnMovieThroughService() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        Movie saved = repo.save(
                new Movie(1L, null, null, null, null)
        );

        MovieService service = new MovieService(
                new GetMovieHandler(repo)
        );

        Movie result = service.getMovie(saved.getId());

        assertNotNull(result);
        assertEquals(saved.getId(), result.getId());
    }

    @Test
    void shouldReturnRecommendationsThroughService() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();

        repo.save(new Movie(1L, null, null, null, null));
        repo.save(new Movie(2L, null, null, null, null));

        RecommendationService service = new RecommendationService(
                new GetUserRecommendationsHandler(repo)
        );

        List<Movie> result = service.getRecommendations(1L);

        assertNotNull(result);
        assertTrue(result.size() >= 2);
    }

    @Test
    void shouldReturnWatchlistThroughService() {

        InMemoryWatchlistRepository watchlistRepo =
                new InMemoryWatchlistRepository();

        Movie movie = new Movie(1L, null, null, null, null);

        watchlistRepo.addToWatchlist(1L, movie);

        WatchlistService service = new WatchlistService(
                new GetWatchlistHandler(watchlistRepo)
        );

        List<Movie> result = service.getWatchlist(1L);

        assertNotNull(result);
        assertEquals(1, result.size());
    }
}