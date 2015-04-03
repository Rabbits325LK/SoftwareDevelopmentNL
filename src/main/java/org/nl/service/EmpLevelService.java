package org.nl.service;

import java.util.List;

import org.nl.model.EmpLevel;
import org.nl.model.page.EmpLevelPage;

/**
 * EmpLevel 接口
 * @author Rabbits
 * @version 1.0 	2015.04.02 	13:49
 *					add(findByPage()) 15:35
 */
public interface EmpLevelService {
	
	void add(EmpLevel emp); //test...ok
	
	List<EmpLevel> findByPage(EmpLevelPage page);  //test...ok
	
	String findByEmpLevelToEmpLevelName(int empLevel); //test...ok
}
