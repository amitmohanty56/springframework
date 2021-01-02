package com.springjdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao_SelectOperation {
	//
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDao_SelectOperation() {
		System.out.println("EmployeeDao_SelectOperation default constructor");
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Map<String, Object>> getTotalEmployee() {
		
		String s = "SELECT userid,password FROM emploginDetails";
	
		 return jdbcTemplate.queryForList(s);
	}
	
   public String getEmployeeUserId(String userid) {
		String ret = "";
		String s = "SELECT password FROM emploginDetails where userid=?";
	
		return ret = jdbcTemplate.queryForObject(s, String.class,userid);
		
		 
	}
	
}
