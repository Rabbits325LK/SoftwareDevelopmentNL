package org.nl.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.DepartmentNum;
import org.nl.model.page.DepartmentNumPage;
import org.nl.service.DepartmentNumService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DepartmentNum TestModel
 * @author Rabbits
 * @version 1.0		2015.04.02 	15:47
 */
public class DepartmentNumTest {
	
	private DepartmentNumService departmentNumService;
	
	//@Before
	public void Before(){
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		departmentNumService = (DepartmentNumService)ctx.getBean("departmentServiceImpl");
	}
	
	//@Test
	public void add(){
		DepartmentNum dn = new DepartmentNum();
		dn.setDepartmentNum(0);
		dn.setDepartmentNumName("待设定");
		departmentNumService.add(dn);
		System.out.println("add...Ok");
	}
	
	//@Test
	public void findByPage(){
		DepartmentNumPage page = new DepartmentNumPage();
		List<DepartmentNum> dns = new ArrayList<DepartmentNum>();
		page.setCurrentPage(1);
		dns = departmentNumService.findByPage(page);
		for(DepartmentNum dn : dns){
			System.out.println("ID:"+dn.getDepartmentNumId());
			System.out.println("NUM:"+dn.getDepartmentNum());
			System.out.println("Name:"+dn.getDepartmentNumName());
		}
	}
	
	//@Test
	public void findByDepartmentNumToByDepartmentNumName(){
		String dName =  departmentNumService.findByDepartmentNumToDepartmentNumName(0);
		System.out.println(dName);
	}
}
