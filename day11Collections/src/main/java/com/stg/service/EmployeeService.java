package com.stg.service;

import java.util.Set;

import com.stg.model.Employee;

public interface EmployeeService {
	
	public abstract Employee searchEmployeeByNum(Set<Employee> set, int emplId);
	public abstract Set<Employee> searchEmployeeByName(Set<Employee> set, String emplName);
	public abstract Set<Employee> searchEmployeeByAge(Set<Employee> set, int age);
	public abstract Set<Employee> searchEmployeeByGender(Set<Employee> set, char empGender);
	
	

}
