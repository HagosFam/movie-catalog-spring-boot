package com.movieCatalog.movie.repository;

import com.movieCatalog.movie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRespository extends JpaRepository<Movie, Long> {
}
