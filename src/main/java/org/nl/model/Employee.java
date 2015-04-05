package org.nl.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 员工类模型
 * @author rabbits325
 * @version 1.0      2015.04.01 10:30
 * 					 2015.04.05 10：18 add(empCode)
 */
public class Employee {
	/**
	 * empId : 员工ID
	 * empCode : 员工帐号
	 * empName : 员工姓名
	 * empPwd : 员工口令
	 * address : 住址
	 * phone : 电话
	 * age : 年龄
	 * sex : 性别  0女  1男
	 * createTime : 录入时间（创建时间）
	 * birth : 出生日期
	 * emplevel : 员工级别  0 最高权限   数字越大权限越低
	 * department : 所属部门
	 * empEmail : 邮箱
	 * empQQ : QQ
	 * empSaraly : 员工工资
	 */
	private Integer empId;    
	private String empCode;
	private String empName;
	private String empPwd;
	private String address;
	private String phone;
	private Integer age;
	private Integer sex;
	private Timestamp createTime;
	private Date birth;
	private Integer empLevel;
	private Integer departmentNum;
	private String empQQ;
	private String empEmail;
	private double empSaraly;
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
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Integer getEmplevel() {
		return empLevel;
	}
	public void setEmplevel(Integer empLevel) {
		this.empLevel = empLevel;
	}
	
	public Integer getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(Integer departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getEmpQQ() {
		return empQQ;
	}
	public void setEmpQQ(String empQQ) {
		this.empQQ = empQQ;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public double getEmpSaraly() {
		return empSaraly;
	}
	public void setEmpSaraly(double empSaraly) {
		this.empSaraly = empSaraly;
	}
	public Integer getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}

	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empCode=" + empCode
				+ ", empName=" + empName + ", empPwd=" + empPwd + ", address="
				+ address + ", phone=" + phone + ", age=" + age + ", sex="
				+ sex + ", createTime=" + createTime + ", birth=" + birth
				+ ", empLevel=" + empLevel + ", departmentNum=" + departmentNum
				+ ", empQQ=" + empQQ + ", empEmail=" + empEmail
				+ ", empSaraly=" + empSaraly + "]";
	}
	
	
}
