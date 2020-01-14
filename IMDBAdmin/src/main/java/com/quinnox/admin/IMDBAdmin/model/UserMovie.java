package com.quinnox.admin.IMDBAdmin.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
public class UserMovie {
	
	private long id;
	private String userName;
	private String userEmail;
	private String movieTitle;
	private int length;
	private float rating;
	private String plot;
	private String genre;
	

}
