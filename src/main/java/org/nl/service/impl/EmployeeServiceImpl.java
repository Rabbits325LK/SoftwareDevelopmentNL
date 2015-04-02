package org.nl.service.impl;

import java.text.ParseException;
import java.util.Date;

import org.nl.dao.EmployeeDao;
import org.nl.model.Employee;
import org.nl.service.EmployeeService;
import org.nl.util.DateChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Employee 业务接口实现类
 * @author Rabbits
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	/**
	 * 添加一条员工数据
	 */
	

	/**
	 * 根据员工姓名查选他的权限等级
	 */
	@Override
	public int findByNameToLevel(String empName) {
		// TODO Auto-generated method stub
		return employeeDao.findByNameToLevel(empName);
	}

	@Override
	public void save(Employee emp, String birthDate) {
		// TODO Auto-generated method stub
		Employee emps = new Employee();
		emps.setEmpName(emp.getEmpName());
		emps.setEmpPwd(emp.getEmpPwd());
		emps.setAddress(emp.getAddress());
		emps.setDepartmentNum(emp.getDepartmentNum());
		emps.setPhone(emp.getPhone());
		emps.setSex(emp.getSex());
		emps.setAge(emp.getAge());
		emps.setEmplevel(emp.getEmplevel());
		emps.setEmpEmail(emp.getEmpEmail());
		emps.setEmpQQ(emp.getEmpQQ());
		emps.setEmpSaraly(emp.getEmpSaraly());
		DateChange dc = new DateChange();
		Date birth;
		try {
			birth = dc.StrToDate(birthDate);
			emps.setBirth(birth);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		employeeDao.save(emp);
	}

}
