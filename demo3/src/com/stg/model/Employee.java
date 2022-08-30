package com.stg.model;

public class Employee {
	private int empId=100;
	private float salary=25000.00f;
	private boolean martialStatus; //DEFAULT VALUE IS FALSE IF WE WONT DECLARE
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public boolean isMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(boolean martialStatus) {
		this.martialStatus = martialStatus;
	}
	
	
}
