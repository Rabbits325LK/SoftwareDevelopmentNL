package org.nl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.nl.dao.DepartmentNumDao;
import org.nl.model.DepartmentNum;
import org.nl.model.page.DepartmentNumPage;
import org.nl.service.DepartmentNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * DepartmentNum 业务接口实现类
 * @author rabbits
 * @version 1.0 	2015.04.02	14:02
 */
@Service
public class DepartmentServiceImpl implements DepartmentNumService {

	@Autowired
	private DepartmentNumDao departmentNumDao;
	
	@Override
	public void add(DepartmentNum dn) {
		// TODO Auto-generated method stub
		departmentNumDao.add(dn);
	}

	@Override
	public List<DepartmentNum> findByPage(DepartmentNumPage page) {
		// TODO Auto-generated method stub
		return departmentNumDao.findByPage(page);
	}

	@Override
	public String findByDepartmentNumToDepartmentNumName(int departmentNum) {
		// TODO Auto-generated method stub
		return departmentNumDao.findByDepartmenNumToDName(departmentNum);
	}

	@Override
	public List<DepartmentNum> findByAll() {
		// TODO Auto-generated method stub
		return departmentNumDao.findByAll();
	}
}
