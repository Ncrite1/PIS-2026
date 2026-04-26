package com.example;

import com.command.CreateMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.domain.model.Movie;
import com.port.out.InMemoryMovieRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreateMovieHandlerTest {

    @Test
    void shouldCreateMovie() {

        InMemoryMovieRepository repo = new InMemoryMovieRepository();
        CreateMovieHandler handler = new CreateMovieHandler(repo);

        CreateMovieCommand command = new CreateMovieCommand(
                "Interstellar",
                "SCI_FI",
                9,
                "Space movie"
        );

        Movie movie = handler.handle(command);

        assertNotNull(movie);
        assertNotNull(movie.getId());
        assertEquals("Interstellar", movie.getTitle().value());
        assertNotNull(repo.findById(movie.getId()));
    }
}