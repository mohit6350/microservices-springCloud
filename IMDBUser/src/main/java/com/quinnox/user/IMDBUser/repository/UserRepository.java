package com.quinnox.user.IMDBUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quinnox.user.IMDBUser.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	@Query(nativeQuery=true, value="select * from user where email = ?1")
	public User findByEmail(String email);
	
}
