package org.nl.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.Employee;
import org.nl.service.EmployeeService;
import org.nl.util.DateChange;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Employee 测试类
 * @author Rabbits
 * @version 1.0 2015.04.01 11:02 test(save())
 * 						   13:44 test(findByNameToLevel())
 *
 */
public class EmployeeTest {

	private EmployeeService employeeService;
	
	@Before
	public void Before(){
		
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		employeeService = (EmployeeService)ctx.getBean("employeeServiceImpl");
	}
	
	@Test
	public void save(){
		Employee emp = new Employee();
		emp.setEmpName("Rabbits");
		emp.setEmpPwd("lkailyt325");
		emp.setAddress("湖南省长沙市");
		emp.setPhone("18676660220");
		emp.setDepartmentNum(0);
		emp.setEmplevel(0);
		emp.setAge(25);
		emp.setSex(1);
		emp.setEmpEmail("rabbits325@live.cn");
		emp.setEmpQQ("40440404");
		emp.setEmpSaraly(20000.00);
		DateChange dc = new DateChange();
		String Birth = "1990-03-25";
		/*try {
			emp.setBirth(dc.StrToDate("1990-03-25"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		employeeService.save(emp, Birth);
		System.out.println("save...OK");
		
	}
	
	//@Test
	public void findByNameToLevel(){
		String empName = "Rabbits";
		int level = employeeService.findByNameToLevel(empName);
		System.out.println(level);
	}
}
