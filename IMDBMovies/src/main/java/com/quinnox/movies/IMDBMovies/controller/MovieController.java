package com.quinnox.movies.IMDBMovies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.movies.IMDBMovies.model.Movie;
import com.quinnox.movies.IMDBMovies.serviceImpl.MovieServiceImpl;

@RestController
@RequestMapping("/rest/movie")
public class MovieController {

	@Autowired
	private MovieServiceImpl movieService;
	
	@GetMapping(value="/find/{id}", produces="application/json")
	public Movie findMovieById(@PathVariable("id") Long id){
		return movieService.getMovieById(id);
	}
	
	@PostMapping(value="/upload", consumes="application/json", produces="application/json")
	public Movie uploadMovie(@RequestBody Movie movie){
		return movieService.addMovie(movie);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public long deleteMovie(@PathVariable("id") Long id){
		movieService.deleteMovie(id);
		return id;
	}
	
	@GetMapping(value="/findAll", produces="application/json")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
}
