package org.nl.dao;

import java.util.List;

import org.nl.model.EmpLevel;
import org.nl.model.page.EmpLevelPage;

/**
 * 员工级别DAO层
 * @author Rabbits
 * @version 1.0 	2015.04.02	11:22
 *
 */
public interface EmpLevelDao {
	
	/**
	 * 添加一条数据
	 * @param emp
	 */
	void add(EmpLevel emp);
	
	/**
	 * 根据Id跟新一条数据
	 * @param emp
	 */
	void updateById(EmpLevel emp);
	
	/**
	 * 根据Id删除一条数据
	 * @param empLevelId
	 */
	void deleteById(int empLevelId);
	
	/**
	 * 根据Id查询一条数据
	 * @param empLevelId
	 * @return
	 */
	EmpLevel findById(int empLevelId);
	
	/**
	 * 根据级别编号查询一条数据
	 * @param empLevel
	 * @return
	 */
	EmpLevel findByEmpLevel(int empLevel);
	
	/**
	 * 查询所有数据
	 * @return
	 */
	List<EmpLevel> findByAll();
	
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
	List<EmpLevel> findByPage(EmpLevelPage page);
}
