package com.stg.model;

public class Employee {
	private int empId;
	private String empName;
	private float salary;
	private float hike;
	
	// public methods for accessing the private variables
	// generate getter setter methods
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
	public float getSalary() {
		return salary;
	}
	public float getHike() {
		return hike;
	}
	public void setHike(float hike) {
		this.hike = hike;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	
	

}
