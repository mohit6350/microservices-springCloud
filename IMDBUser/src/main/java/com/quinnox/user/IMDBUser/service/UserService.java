package com.quinnox.user.IMDBUser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.user.IMDBUser.model.User;
import com.quinnox.user.IMDBUser.repository.UserRepository;

@Service
public interface UserService {

	
	public User findUserById(Long id);
	
	public List<User> findAllUser();
	
	public User addUser(User user);
	
	public void deleteUser(Long id);
	
	public User findByEmail(String email);
	
}
