package com.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.loginapp.model.LoginModelDTO;
import com.loginapp.service.LoginService;
import com.loginapp.validation.LoginValidator;

@Controller
public class LoginController {
	
	public LoginController() {
		System.out.println("LoginController default constructor");
	}

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginModelDTO loginModelDTO;
	
	@Autowired
	private LoginValidator loginValidator;
	
	
	@RequestMapping(value= "/login.htm", method = RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println("--welcomeLoginUser GET method--");
		ModelAndView mv = new ModelAndView("login");
		//LoginModelDTO dto = new LoginModelDTO();
		loginModelDTO.setUsername("amit");
		mv.getModelMap().put("loginModel", loginModelDTO);
		
		
		return mv;
		
	}
	
	
	
	@RequestMapping(value= "/loginApp.htm", method = RequestMethod.POST)
	public ModelAndView getLoginUser(@ModelAttribute LoginModelDTO loginModelDTO,BindingResult bindingResult) {
		System.out.println("--getLoginUser POST method--");
		String viewName = null;
		ModelAndView mv = new ModelAndView();
		
		//Validating the user input from UI. the inputs will bind to bindingResults and the validate method 
		//will bind the error if have during validation.
		loginValidator.validate(loginModelDTO, bindingResult);
		
		
		//If any error then return to login page with the error.
		if(bindingResult.hasErrors()) {
			mv.setViewName("login");
			mv.getModelMap().put("loginModel", loginModelDTO);
			return mv;
		}
		
		boolean isValidUser = loginService.checkValidUser(loginModelDTO);
		
		if(isValidUser) {
			viewName = "success";
		}else {
			viewName = "fail";
		}
		
		mv.setViewName(viewName);
		
		
		mv.getModelMap().put("loginModel1", loginModelDTO);
		
		return mv;
		
	}
}
