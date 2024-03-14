package com.movieCatalog.movie.service;

import com.movieCatalog.movie.domain.Movie;
import com.movieCatalog.movie.domain.Review;

import java.util.List;

public interface MovieService {
    public List<Movie> getMoives();
    public List<Review> getMovieReviews(String movieId);
    public void createMovie(Movie movie);
    public void addReview(Review review, String movieId);
    public Movie updateMovie(Movie movie, String movieId);
    public Review updateReview(Review review, String reviewId);
    public void deleteMovie(String movieId);
    public void deleteReview(String reviewId);
}
