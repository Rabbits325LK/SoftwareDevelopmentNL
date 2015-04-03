package org.nl.service;

import java.util.List;

import org.nl.model.Attendance;

/**
 * 考勤业务接口
 * @author Rabbits
 * @version 1.0 	2015.04.03  11：18
 */
public interface AttendanceService {
	
	/**
	 * 上班
	 * @param attendance
	 */
	void addStart(Attendance attendance);   //test...ok
	
	
	/**
	 * 下班
	 * @param empName
	 */
	void addStopForName(String empName);   //test...ok
	
	/**
	 * 根据名字分页查询考勤记录
	 * @param empName
	 * @param begin
	 * @return
	 */
	List<Attendance> findByNamePage(String empName, int begin);  //test...Ok
}
