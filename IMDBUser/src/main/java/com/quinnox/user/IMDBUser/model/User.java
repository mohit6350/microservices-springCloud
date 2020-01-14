package com.quinnox.user.IMDBUser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class User {
	
	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String email;

	
	
	

}
