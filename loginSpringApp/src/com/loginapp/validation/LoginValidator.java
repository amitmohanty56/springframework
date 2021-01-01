package com.loginapp.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.loginapp.model.LoginModelDTO;

@Component
public class LoginValidator implements Validator{
//<LoginModelDTO>
	
	public LoginValidator() {
		System.out.println("--LoginValidator default constructor--");
	}
	@Override
	public boolean supports(Class<?> validationClass) {
		System.out.println("**LoginValidator supports method called**");
		return validationClass.equals(LoginModelDTO.class);
		
	}

	@Override
	public void validate(Object model, Errors error) {
		//If don't want to user spring ValidationUtils Class then type case the model object 
		//and manually validate the username and password for all the possibility of validation.
		
		//ValidationUtils provide Validation logic.
		ValidationUtils.rejectIfEmpty(error, "username", null,"UserName is required");
		ValidationUtils.rejectIfEmpty(error, "password", "Password is Required");
	}

}
