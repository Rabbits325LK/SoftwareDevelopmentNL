package org.nl.dao;

import java.util.List;

import org.nl.model.Employee;
import org.nl.model.page.EmployeePage;

/**
 * EmployeeDao 层
 * @author Rabbits
 * @version 1.0 2015.04.01 10：33
 */
public interface EmployeeDao {
	
	/**
	 * 添加一条数据
	 * @param emp
	 */
	void save(Employee emp);
	
	/**
	 * 根据Id 删除一条数据
	 * @param id
	 */
	void deleteById(int empId);
	
	/**
	 * 查询全部
	 * @return
	 */
	List<Employee> findByAll();
	
	/**
	 * 根据Id 修改一条信息名称
	 * @param id
	 */
	void UpdateByIdToName(int empId);
	
	/**
	 * 根据名字修改 资料
	 * @param emp
	 */
	void UpdateByName(Employee emp);
	
	/**
	 * 根据名字修改密码
	 * @param emp
	 */
	void UpdateByNameToPwd(Employee emp);
	
	/**
	 * 根据id 查询数据
	 * @param id
	 * @return
	 */
	Employee findById(int id);
	
	/**
	 * 根据名字查询权限等级
	 * @param empName
	 * @return
	 */
	int findByNameToLevel(String empName);
	
	/**
	 * 根据名字修改权限等级
	 * @param emp
	 */
	void updateByNameToLevel(Employee emp);
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<Employee> findByPage(EmployeePage page);
	
	/**
	 * 查询总记录条数
	 * @return
	 */
	int findRows();
}
