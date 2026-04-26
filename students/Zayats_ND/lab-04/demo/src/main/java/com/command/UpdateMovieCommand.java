package com.command;

public final class UpdateMovieCommand {

    private final Long movieId;
    private final String title;
    private final String genre;
    private final int rating;
    private final String description;

    public UpdateMovieCommand(Long movieId, String title, String genre, int rating, String description) {
        if (movieId == null || movieId <= 0)
            throw new IllegalArgumentException("Invalid movieId");

        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title is invalid");

        if (genre == null || genre.isBlank())
            throw new IllegalArgumentException("Genre is invalid");

        if (rating < 0 || rating > 10)
            throw new IllegalArgumentException("Rating must be 0-10");

        if (description == null)
            throw new IllegalArgumentException("Description is required");

        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.description = description;
    }

    public Long getMovieId() { return movieId; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getRating() { return rating; }
    public String getDescription() { return description; }
}