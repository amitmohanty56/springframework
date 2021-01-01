import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;

public class TestClient {

	public static void main(String[] args) {
		PropertyPlaceholderConfigurer p;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
		EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
		dao.updateEmployee();
		System.out.println(" Employee Details Updated ");
		//dao.indertEmployee();
		//System.out.println(" Employee Details Inserted ");

	}

}
