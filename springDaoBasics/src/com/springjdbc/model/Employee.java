package com.springjdbc.model;

public class Employee {
	
	private String userId;
	private String password;
	
	public Employee() {
		System.out.println("Employee Default Constructor");
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
