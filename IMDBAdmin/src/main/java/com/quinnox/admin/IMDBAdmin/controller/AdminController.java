package com.quinnox.admin.IMDBAdmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.admin.IMDBAdmin.serviceImpl.UserMovieServiceImpl;

@RestController
@RequestMapping("/rest/admin")
public class AdminController {

	@Autowired
	private UserMovieServiceImpl userMovieService;
	
	@GetMapping(value="/findAll", produces="application/json")
	public String findAllData(){
		return userMovieService.findAllData();
	}
	
}
