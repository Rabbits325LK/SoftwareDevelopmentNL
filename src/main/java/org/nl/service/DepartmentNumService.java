package org.nl.service;

import java.util.List;

import org.nl.model.DepartmentNum;
import org.nl.model.page.DepartmentNumPage;

/**
 * Department 业务接口
 * @author Rabbits
 * @version 1.0		2015.04.02	14:00
 *
 */
public interface DepartmentNumService {
	void add(DepartmentNum dn);    //test...ok
	
	List<DepartmentNum> findByPage(DepartmentNumPage page);  //test...ok
	
	String findByDepartmentNumToDepartmentNumName(int departmentNum); //test...ok
}
