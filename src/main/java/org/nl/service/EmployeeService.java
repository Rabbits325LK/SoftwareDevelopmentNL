package org.nl.service;

import java.util.Map;

import org.nl.model.Employee;

/**
 * Employee 业务接口
 * @author Rabbits
 * @version 1.1  2015.04.01 10:35 
 * 							13:45 add(findByNameToLevel())
 */
public interface EmployeeService {
	
	void save(Employee emp ,String birthDate);  //Test。。。ok
	
	int findByNameToLevel(String empName);  //Test。。。ok
	
	/**
	 * 业务逻辑 
	 * 根据姓名查询部门 职位
	 * @param empName
	 * @return
	 */
	Map<String,String> findByINLD(String empName);  //Test。。。ok
}
