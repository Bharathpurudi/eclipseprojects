package com.model;

public class Employee {
	private int emplId;
	private String emplName;
	private String empDept;
	private float salary;
	public Employee() {
		super();
	}
	public Employee(int emplId, String emplName, String empDept, float salary) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
		this.empDept = empDept;
		this.salary = salary;
	}
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
