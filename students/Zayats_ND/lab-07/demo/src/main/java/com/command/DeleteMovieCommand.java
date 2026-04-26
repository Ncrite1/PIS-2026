package com.command;

public final class DeleteMovieCommand {

    private final Long movieId;

    public DeleteMovieCommand(Long movieId) {
        if (movieId == null || movieId <= 0)
            throw new IllegalArgumentException("Invalid movieId");

        this.movieId = movieId;
    }

    public Long getMovieId() { return movieId; }
}