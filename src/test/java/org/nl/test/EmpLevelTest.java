package org.nl.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.EmpLevel;
import org.nl.model.page.EmpLevelPage;
import org.nl.service.EmpLevelService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * EmpLevel TestModel
 * @author Rabbits
 * @version 1.0 	2015.04.02	13:52
 */
public class EmpLevelTest {
	
	private EmpLevelService empLevelService;
	
	//@Before
	public void Before(){
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		empLevelService = (EmpLevelService) ctx.getBean("empLevelServiceImpl");
	}
	
    //@Test
	public void add(){
		EmpLevel emp = new EmpLevel();
		emp.setEmpLevel(99);
		emp.setEmpLevelName("系统管理员");
		empLevelService.add(emp);
		System.out.println("save...Ok");
	}
	
	//@Test
	public void findByPage(){
		List<EmpLevel> emps = new ArrayList<EmpLevel>();
		EmpLevelPage page = new EmpLevelPage();
		page.setCurrentPage(2);
		emps = empLevelService.findByPage(page);
		for(EmpLevel emp : emps){
			System.out.println("ID:"+emp.getEmpLevelId());
			System.out.println("Level:"+emp.getEmpLevel());
			System.out.println("Name:"+emp.getEmpLevelName());
		}
	}
	
	//@Test
	public void findByEmpLevelToEmpLevelName(){
		String lName = empLevelService.findByEmpLevelToEmpLevelName(0);
		System.out.println(lName);
	}
}
