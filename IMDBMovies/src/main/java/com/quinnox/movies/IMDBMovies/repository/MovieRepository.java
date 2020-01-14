package com.quinnox.movies.IMDBMovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quinnox.movies.IMDBMovies.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
