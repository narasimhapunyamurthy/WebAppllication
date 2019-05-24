package com.app.model;

public class Customer {
	private Integer empNo;
	private String empName;
	private String empAddress;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Customer(Integer empNo, String empName, String empAddress) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	
	
}
