package com.loginapp.model;

import org.springframework.stereotype.Component;

@Component
public class LoginModelDTO {
	
	private String username;
	private String password;
	
	
	public LoginModelDTO() {
		super();
		System.out.println("---LoginModelDTO default Constructor---");
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
		System.out.println("---setUsername Method Called---");
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
		System.out.println("---setPassword Method Called---");
	}


	
	

}
