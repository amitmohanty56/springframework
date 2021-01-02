package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDao() {
		super();
		System.out.println("EmployeeDao default constructor");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void updateEmployee() {
		String updateQuery = "Update emploginDetails set password='amit123' where userid='amit'";
		int i = jdbcTemplate.update(updateQuery);
		System.out.println("No of rows updated :" + i);
	}
	
	public void indertEmployee() {
		String insertQuery = "Insert into emploginDetails (userid,password) values ('asit','asit2021')";
		int i = jdbcTemplate.update(insertQuery);
		System.out.println("No of rows inserted :" + i);
	}
	
	

}
