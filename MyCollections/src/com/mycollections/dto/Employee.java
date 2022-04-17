package com.mycollections.dto;

public class Employee {

	private int empId;
	private String empName;
	private String empGender;
	private String empNum;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpNum() {
		return empNum;
	}

	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empNum=" + empNum
				+ "]";
	}

	public Employee(int empId, String empName, String empGender, String empNum) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGender = empGender;
		this.empNum = empNum;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
