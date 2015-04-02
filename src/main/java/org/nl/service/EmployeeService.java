package org.nl.service;

import org.nl.model.Employee;

/**
 * Employee 业务接口
 * @author Rabbits
 * @version 1.1  2015.04.01 10:35 
 * 							13:45 add(findByNameToLevel())
 */
public interface EmployeeService {
	
	void save(Employee emp ,String birthDate);
	
	int findByNameToLevel(String empName);
}
