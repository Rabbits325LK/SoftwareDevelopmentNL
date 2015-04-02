package org.nl.model;

/**
 * 部门编号模型
 * @author Rabbits
 * @version 1.0		2015.04.02	11:36
 */
public class DepartmentNum {
	
	/**
	 * departmentNumId : id
	 * departmentNum : 部门编号
	 * departmentNumName : 部门名称
	 */
	
	private Integer departmentNumId;
	private Integer departmentNum;
	private String departmentNumName;
	public Integer getDepartmentNumId() {
		return departmentNumId;
	}
	public void setDepartmentNumId(Integer departmentNumId) {
		this.departmentNumId = departmentNumId;
	}
	public Integer getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(Integer departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getDepartmentNumName() {
		return departmentNumName;
	}
	public void setDepartmentNumName(String departmentNumName) {
		this.departmentNumName = departmentNumName;
	}
	@Override
	public String toString() {
		return "DepartmentNum [departmentNumId=" + departmentNumId
				+ ", departmentNum=" + departmentNum + ", departmentNumName="
				+ departmentNumName + "]";
	}
	
	
}
