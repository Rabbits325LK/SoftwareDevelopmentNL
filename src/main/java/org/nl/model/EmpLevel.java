package org.nl.model;

/**
 * 员工级别模型
 * @author Rabbits
 * @version 1.0    2015.04.02   11:19
 */
public class EmpLevel {
	/**
	 * empLevelId : 员工级别id(排序)
	 * empLevel : 员工级别编号
	 * empLevel : 员工级别职称
	 */
	private Integer empLevelId;
	private Integer empLevel;
	private String empLevelName;
	
	public Integer getEmpLevelId() {
		return empLevelId;
	}
	public void setEmpLevelId(Integer empLevelId) {
		this.empLevelId = empLevelId;
	}
	public Integer getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}
	public String getEmpLevelName() {
		return empLevelName;
	}
	public void setEmpLevelName(String empLevelName) {
		this.empLevelName = empLevelName;
	}
	
	@Override
	public String toString() {
		return "EmpLevel [empLevelId=" + empLevelId + ", empLevel=" + empLevel
				+ ", empLevelName=" + empLevelName + "]";
	}
	
}
