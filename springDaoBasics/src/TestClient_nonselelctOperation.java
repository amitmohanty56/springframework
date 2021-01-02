import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao_NonSelectOperation;
import com.springjdbc.dao.EmployeeDao_SelectOperation;

public class TestClient_nonselelctOperation {

	public static void main(String[] args) {
		
  ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
		
  EmployeeDao_SelectOperation dao = context.getBean("employeeDaoSelectOpertion",EmployeeDao_SelectOperation.class);
  
  //List<Map<String, Object>> ret = dao.getTotalEmployee();
  //System.out.println(ret);

  String password = dao.getEmployeeUserId("amit");
  System.out.println("userid password is " + password);
  
	}

}
