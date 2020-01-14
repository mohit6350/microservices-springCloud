package com.quinnox.movies.IMDBMovies.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Movie implements Serializable{

	@Id
	@Column
	private Long id;
	@Column
	private String title;
	@Column
	private int length;
	@Column
	private float rating;
	@Column
	private String genre;
	@Column
	private String plot;
	
	
}
