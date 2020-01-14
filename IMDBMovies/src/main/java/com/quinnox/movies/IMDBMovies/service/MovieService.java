package com.quinnox.movies.IMDBMovies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quinnox.movies.IMDBMovies.model.Movie;

@Service
public interface MovieService {
	
	public List<Movie> getAllMovies();
	
	public Movie getMovieById(Long id);
	
	public Movie addMovie(Movie movie);
	
	public void deleteMovie(Long id);

}
