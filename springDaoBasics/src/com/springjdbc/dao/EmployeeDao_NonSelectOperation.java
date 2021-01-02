package com.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

public class EmployeeDao_NonSelectOperation {
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDao_NonSelectOperation() {
		super();
		System.out.println("EmployeeDao default constructor");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
	public void insertEmployee() {
		String insertQuery = "Insert into emploginDetails (userid,password) values ('asit','asit2021')";
		int i = jdbcTemplate.update(insertQuery);
		System.out.println("No of rows inserted :" + i);
	}
	
	//Place value to the dynamic query.
	public void insertEmployeeDynamicQuery(String userId,String password) {
		String insertQuery = "Insert into emploginDetails (userid,password) values (?,?)";
		int i = jdbcTemplate.update(insertQuery,userId,password);
		System.out.println("No of rows inserted :" + i);
	}
	//Place value to the dynamic query using varArg argument
	public void insertEmployeeDynamicQueryWithVarArgObj(String userId,String password) {
		Object [] inputParms = new Object[] {userId,password}; 
		String insertQuery = "Insert into emploginDetails (userid,password) values (?,?)";
		int i = jdbcTemplate.update(insertQuery,inputParms);//the second argument is a VarArg argument.
		System.out.println("No of rows inserted :" + i);
	}
	
	//Place value to the dynamic query using varArg argument and inputArgument type.
		public void insertEmployeeDynamicQueryWithVarArgObjAndParameterType(String userId,String password) {
			Object [] inputParms = new Object[] {userId,password}; 
			int [] inputParamsType = new int[] {Types.VARCHAR,Types.VARCHAR};
			String insertQuery = "Insert into emploginDetails (userid,password) values (?,?)";
			int i = jdbcTemplate.update(insertQuery,inputParms,inputParamsType);//the third argument is a input type.
			System.out.println("No of rows inserted :" + i);
		}
	
		public void updateEmployee() {
			String updateQuery = "Update emploginDetails set password='amit123!' where userid='amit'";
			int i = jdbcTemplate.update(updateQuery);
			
			System.out.println("No of rows updated :" + i);
		}
		//Used PreparedStatementSetter to dynamically pass input.
		public void updateEmployeeUsingPreparedStatementSetter(String userId,String password) {
			
			String updateQuery = "Update emploginDetails set password=? where userid=?";
			int i = jdbcTemplate.update(updateQuery, new PreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1,password);
					ps.setString(2, userId);
					
				}
				
			});
			System.out.println("No of rows updated UsingPreparedStatementSetter :" + i);
		}
	

}
