package org.nl.dao;

import java.util.List;

import org.nl.model.DepartmentNum;
import org.nl.model.page.DepartmentNumPage;

/**
 * 部门编号DAO层
 * @author Rabbits
 * @version 1.0 	2015.04.02	11:40
 */
public interface DepartmentNumDao {
	
	/**
	 * 添加一条数据
	 * @param dn
	 */
	void add(DepartmentNum dn);
	
	/**
	 * 根据Id跟新一条数据
	 * @param dn
	 */
	void updateById(DepartmentNum dn);
	
	/**
	 * 根据Id删除一条数据
	 * @param departmentNumId
	 */
	void deleteById(int departmentNumId);
	
	/**
	 * 根据id 查询一条数据
	 * @param departmentNumId
	 * @return
	 */
	DepartmentNum findById(int departmentNumId);
	
	/**
	 * 根据编号查询一条数据
	 * @param departmenNum
	 * @return
	 */
	DepartmentNum findByDepartmenNum(int departmenNum);
	
	/**
	 * 查询所有数据
	 * @return
	 */
	List<DepartmentNum> findByAll();
	
	/**
	 * 查询数据总条数
	 * @return
	 */
	int findRows();
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<DepartmentNum> findByPage(DepartmentNumPage page);
}
