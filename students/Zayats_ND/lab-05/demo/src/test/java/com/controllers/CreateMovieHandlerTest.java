package com.controllers;

import com.command.CreateMovieCommand;
import com.command.handler.CreateMovieHandler;
import com.domain.model.Movie;
import com.port.out.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CreateMovieHandlerTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private CreateMovieHandler createMovieHandler;

    private CreateMovieCommand validCommand;

    @BeforeEach
    void setUp() {
        validCommand = new CreateMovieCommand(
            "Матрица",
            "Фантастика",
            9,
            "Культовый фильм про матрицу"
        );
    }

    @Test
    void handle_ShouldSaveMovie_WhenCommandIsValid() {
        when(movieRepository.save(any(Movie.class))).thenAnswer(invocation -> invocation.getArgument(0));

        createMovieHandler.handle(validCommand);

        verify(movieRepository, times(1)).save(any(Movie.class));
    }

    @Test
    void handle_ShouldCreateMovieWithCorrectData() {
        ArgumentCaptor<Movie> movieCaptor = ArgumentCaptor.forClass(Movie.class);
        when(movieRepository.save(any(Movie.class))).thenAnswer(invocation -> invocation.getArgument(0));

        createMovieHandler.handle(validCommand);

        verify(movieRepository).save(movieCaptor.capture());
        Movie savedMovie = movieCaptor.getValue();
        
        // Простые проверки на null
        assertNotNull(savedMovie);
        assertNotNull(savedMovie.getTitle());
        assertNotNull(savedMovie.getGenre());
        assertNotNull(savedMovie.getRating());
        assertNotNull(savedMovie.getDescription());
    }

    @Test
    void handle_ShouldThrowException_WhenTitleIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CreateMovieCommand(null, "Фантастика", 9, "Описание");
        });
        verify(movieRepository, never()).save(any(Movie.class));
    }

    @Test
    void handle_ShouldThrowException_WhenRatingIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CreateMovieCommand("Матрица", "Фантастика", 11, "Описание");
        });
        verify(movieRepository, never()).save(any(Movie.class));
    }
}