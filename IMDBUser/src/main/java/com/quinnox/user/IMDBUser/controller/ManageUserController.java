package com.quinnox.user.IMDBUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.user.IMDBUser.model.User;
import com.quinnox.user.IMDBUser.repository.UserRepository;
import com.quinnox.user.IMDBUser.serviceImpl.UserServiceImpl;


@RestController
@RequestMapping("/rest/user")
public class ManageUserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping(value="/fing/{id}", produces="application/json")
	public User findUserById(@PathVariable("id")Long id){
		return userService.findUserById(id);
	}
	
	@GetMapping(value="/findAll")
	public List<User> findAllUsers(){
		return userService.findAllUser();
	}
	
	@PostMapping(value="/add", consumes="application/json", produces="application/json")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}

	@DeleteMapping(value="/delete/{id}")
	public Long deleteUser(@PathVariable("id" )Long id){
		userService.deleteUser(id);
		return id;
	}
	
	@GetMapping(value="/email/{email}")
	public User findByEmail(@PathVariable("email") String email){
		return userService.findByEmail(email);
	}
}
