package com.loginapp.service;

import org.springframework.stereotype.Service;

import com.loginapp.model.LoginModelDTO;

@Service
public class LoginService {
	
	public LoginService() {
		System.out.println("LoginService default constructor");
	}
	
	public boolean checkValidUser(LoginModelDTO loginModelDTO) {
		boolean isValidUser = false;
		if(loginModelDTO.getUsername().equals("amit") && loginModelDTO.getPassword().equals("pass")) {
			isValidUser = true;
		}
		
		return isValidUser;
	}

}
