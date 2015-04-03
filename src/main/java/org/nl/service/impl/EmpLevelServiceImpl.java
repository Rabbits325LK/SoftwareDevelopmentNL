package org.nl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.nl.dao.EmpLevelDao;
import org.nl.model.EmpLevel;
import org.nl.model.page.EmpLevelPage;
import org.nl.service.EmpLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * EmpLevel 业务接口实现类
 * @author Rabbits
 * @version 1.0		2015.04.02	13:50
 */
@Service
public class EmpLevelServiceImpl implements EmpLevelService{

	@Autowired
	private EmpLevelDao empLevelDao;
	
	@Override
	public void add(EmpLevel emp) {
		// TODO Auto-generated method stub
		empLevelDao.add(emp);
	}

	@Override
	public List<EmpLevel> findByPage(EmpLevelPage page) {
		// TODO Auto-generated method stub
		return empLevelDao.findByPage(page);
	}

	@Override
	public String findByEmpLevelToEmpLevelName(int empLevel) {
		// TODO Auto-generated method stub
		return empLevelDao.findByEmpLevelToEmpLevelName(empLevel);
	}

}
