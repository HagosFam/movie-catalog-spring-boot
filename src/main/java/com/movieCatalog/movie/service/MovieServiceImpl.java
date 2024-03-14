package com.movieCatalog.movie.service;

import com.movieCatalog.movie.domain.Movie;
import com.movieCatalog.movie.domain.Review;
import com.movieCatalog.movie.repository.MovieRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRespository movieRespository;

    @Override
    public List<Movie> getMoives() {
        return null;
    }

    @Override
    public List<Review> getMovieReviews(String movieId) {
        return null;
    }

    @Override
    public void createMovie(Movie movie) {

    }

    @Override
    public void addReview(Review review, String movieId) {

    }

    @Override
    public Movie updateMovie(Movie movie, String movieId) {
        return null;
    }

    @Override
    public Review updateReview(Review review, String reviewId) {
        return null;
    }

    @Override
    public void deleteMovie(String movieId) {

    }

    @Override
    public void deleteReview(String reviewId) {

    }
}
