package com.quinnox.movies.IMDBMovies.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.movies.IMDBMovies.model.Movie;
import com.quinnox.movies.IMDBMovies.repository.MovieRepository;
import com.quinnox.movies.IMDBMovies.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie getMovieById(Long id) {
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(Long id) {
		 movieRepository.deleteById(id);
	}

	
}
