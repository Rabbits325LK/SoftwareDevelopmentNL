package org.nl.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.nl.dao.DepartmentNumDao;
import org.nl.dao.EmpLevelDao;
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

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmpLevelDao empLevelDao;
	@Autowired
	private DepartmentNumDao departmentNumDao;
	
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

	@Override
	public Map<String, String> findByINLD(String empName) {  
		// TODO Auto-generated method stub
		int lNum = employeeDao.findByNameToLevel(empName); //通过员工姓名 调用 employeeDao 方法取得 级别编号
		//System.out.println(lNum);
		int dNum = employeeDao.findByDepartmentNum(empName); //通过员工姓名 调用 employeeDao 方法取得 部门编号
		//System.out.println(dNum);
		String eName = empLevelDao.findByEmpLevelToEmpLevelName(lNum);  //通过级别编号 调用 empLevelDao 方法取得 职称
		//System.out.println(eName);
		String dName = departmentNumDao.findByDepartmenNumToDName(dNum);  //通过部门编号 调用 departmentNumDao 方法取得部门名称
		//System.out.println(dName);
		Map<String, String> inld = new HashMap<String,String>();   //放入Map
		inld.put("empName", empName);
		inld.put("eName", eName);
		inld.put("dName", dName);
		System.out.println();
		return inld;  //返回出去
	}

}
