package com.example.movies.domain.model;

public class Movie {
    private final Long id;
    private final String title;
    private final String genre;
    private final int releaseYear;
    private final double rating;
    private final String description;

    public Movie(Long id, String title, String genre, int releaseYear, double rating, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.description = description;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public double getRating() { return rating; }
    public String getDescription() { return description; }
}