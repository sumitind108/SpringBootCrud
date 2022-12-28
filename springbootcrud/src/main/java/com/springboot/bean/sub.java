package com.springboot.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sub")
public class sub {
	
	@Id
	private String name;
	private String email;
	
	
	
	
	public sub() {
		super();
	}


	public sub(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
