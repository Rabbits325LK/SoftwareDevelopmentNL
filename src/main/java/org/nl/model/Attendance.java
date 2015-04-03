package org.nl.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 考勤类模型
 * 
 * @author Rabbits
 * @version 1.0 2015.04.03
 */
public class Attendance {

	/**
	 * attendanceId:考勤Id 
	 * empId:员工编号
	 * empName:员工名字
	 * departmentNum:部门编号 
	 * empLevel:员工级别
	 * startTime:上班时间 
	 * stopTime:下班时间 
	 * overTime:加班（小时） 
	 * lateTime：迟到（小时）
	 * leaveOneDay:请假（天）
	 * leaveOneHalfDay：请假（半天）
	 * createTime 创建时间
	 */
	private Integer attendanceId;
	private Integer empId;
	private String empName;
	private Integer departmentNum;
	private Integer empLevel;
	private Date startTime;
	private Date stopTime;
	private Integer overTime;
	private Integer lateTime;
	private Integer leaveOneDay;
	private Integer leaveOnehalfDay;
	private Timestamp createTime;
	public Integer getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(Integer departmentNum) {
		this.departmentNum = departmentNum;
	}
	public Integer getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStopTime() {
		return stopTime;
	}
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}
	public Integer getOverTime() {
		return overTime;
	}
	public void setOverTime(Integer overTime) {
		this.overTime = overTime;
	}
	public Integer getLateTime() {
		return lateTime;
	}
	public void setLateTime(Integer lateTime) {
		this.lateTime = lateTime;
	}
	public Integer getLeaveOneDay() {
		return leaveOneDay;
	}
	public void setLeaveOneDay(Integer leaveOneDay) {
		this.leaveOneDay = leaveOneDay;
	}
	public Integer getLeaveOnehalfDay() {
		return leaveOnehalfDay;
	}
	public void setLeaveOnehalfDay(Integer leaveOnehalfDay) {
		this.leaveOnehalfDay = leaveOnehalfDay;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", empId=" + empId
				+ ", empName=" + empName + ", departmentNum=" + departmentNum
				+ ", empLevel=" + empLevel + ", startTime=" + startTime
				+ ", stopTime=" + stopTime + ", overTime=" + overTime
				+ ", lateTime=" + lateTime + ", leaveOneDay=" + leaveOneDay
				+ ", leaveOnehalfDay=" + leaveOnehalfDay + ", createTime="
				+ createTime + "]";
	}
	
	
}
