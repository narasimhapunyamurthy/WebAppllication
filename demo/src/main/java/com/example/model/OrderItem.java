package com.example.model;


public class OrderItem {
	private String oId;
	private String oName;
	private String oAddress;
	private Integer oAge;
	public String getoId() {
		return oId;
	}
	public void setoId(String oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoAddress() {
		return oAddress;
	}
	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}
	public Integer getoAge() {
		return oAge;
	}
	public void setoAge(Integer oAge) {
		this.oAge = oAge;
	}
}
