import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao_NonSelectOperation;

public class TestClient {

	public static void main(String[] args) {
		PropertyPlaceholderConfigurer p;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
		EmployeeDao_NonSelectOperation dao = context.getBean("employeeDao",EmployeeDao_NonSelectOperation.class);
		//dao.updateEmployee();
		//System.out.println(" Employee Details Updated ");
		//dao.insertEmployee();
		//System.out.println(" Employee Details Inserted ");
		//dao.insertEmployeeDynamicQuery("arpita", "arpita2020");
		//System.out.println(" Employee Details Inserted dynamically");
		//dao.insertEmployeeDynamicQueryWithVarArgObj("jacob", "jacob2021");
		//System.out.println(" Employee Details Inserted dynamically using vararg argument");
		//dao.insertEmployeeDynamicQueryWithVarArgObjAndParameterType("stephan", "stephan123");
		//System.out.println(" Employee Details Inserted dynamically using input argument tyep");
		dao.updateEmployeeUsingPreparedStatementSetter("arpita", "arpita2021");
		System.out.println(" Employee Details updated dynamically using PreparedStatementSetter ");

	}

}
