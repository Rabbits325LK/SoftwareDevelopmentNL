package org.nl.dao;

import java.util.List;

import org.nl.model.Attendance;
import org.nl.model.page.AttendancePage;

/**
 * 考勤类 DAO　层　接口
 * @author Rabbtis
 * @version 1.0 	2015.04.03	10:31
 */
public interface AttendanceDao {
	
	/**
	 * 上班打开
	 * @param attendance
	 */
	void addStart(Attendance attendance);
	
	/**
	 * 根据名字查询考勤Id
	 * @param empName
	 * @return
	 */
	int findByEmpName(String empName);
	
	/**
	 * 根据id 添加下班时间
	 * @param attendance
	 */
	void addStopForName(int attendanceId);
	
	/**
	 * 请一天假
	 * @param attendance
	 */
	void addLeaveDay(Attendance attendance);
	
	/**
	 * 请半天假
	 * @param attendance
	 */
	void addLeaveHalfDay(Attendance attendance);
	
	/**
	 * 根据Id修改 加班时间
	 * @param attendance
	 */
	void updateByIdToOverTime(Attendance attendance);
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<Attendance> findByPage(AttendancePage page);
	
	/**
	 * 根据员工名字分页查询
	 * @param page
	 * @return
	 */
	List<Attendance> findByNamePage(String empName, int begin);
	
	/**
	 * 根据部门分页查询
	 * @param page
	 * @return
	 */
	List<Attendance> findByDepartmentNumPage(int departmentNum, int begin);
	
	/**
	 * 根据Id删除一条数据
	 * @param attendanceId
	 */
	void deleteById(int attendanceId);
	
	/**
	 * 根据员工Id删除
	 * @param empId
	 */
	void deleteByEmpId(int empId);
	
	/**
	 * 根据部门编号删除
	 * @param departmentNum
	 */
	void deleteByDepartmentNum(int departmentNum);
	
	/**
	 * 查询总条数
	 * @return
	 */
	int findRows();
	
}
