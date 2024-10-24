package com.javalearning.streams;

import java.util.Arrays;
import java.util.List;

public class Movie {

    private String title;

    private String genre;

    private Integer duration; // minutes

    private Integer views;

    public Movie(String title, String genre, Integer duration, Integer views) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getViews() {
        return views;
    }

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(

                new Movie("Avangers", "Action", 150, 1000)
        );

        /**
         * Task 1: Given a list of movie titles, some titles are duplicates
         * (movies watched multiple times). Create a list of distinct movies.
         */
    }
}
