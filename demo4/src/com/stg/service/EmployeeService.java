package com.stg.service;

import com.stg.model.Employee;

public class EmployeeService {

	public String empNameValidation(Employee employee) {
		String temp = "";
		if (employee.getEmpName().length() >= 5) {
			temp = "Success and proceed";
		} else {
			temp = "Name should be more than 5 letters";
		}
		;
		return temp;
	}

	// Method to compare salary of two employees
	public Employee salaryDifferance(Employee employee1, Employee employee2) {
		if (employee1.getSalary() > employee2.getSalary()) {
			return employee1;
		}
		return employee2;
	}

	// Method to calculate the budget
	public float budget(Employee[] employees) {
		float totalBudget = 0.0f;
		for (Employee employee : employees) {
			totalBudget += employee.getSalary();
		}
		return totalBudget;
	}

	// Method to compare the salaries of three employees

	public Employee comapareSalaries(Employee employee1, Employee employee2, Employee employee3) {
		if ((employee1.getSalary() > employee2.getSalary()) && (employee1.getSalary() > employee3.getSalary())) {
			return employee1;
		} else if (employee2.getSalary() > employee3.getSalary()) {
			return employee2;
		} else {
			return employee3;
		}
	}

	// Method to add hike to all the employees

	public String[] addingHike(Employee[] employees) {
		int lengthOfArray = employees.length;
		String[] hikedSalariesArray = new String[lengthOfArray];
		for (int i = 0; i < lengthOfArray; i++) {
			if (employees[i].getHike()>0) {
				hikedSalariesArray[i] = "Hiked salary of " + employees[i].getEmpName() + " is "
						+ (employees[i].getHike() + employees[i].getSalary()) + ". Hike is " + employees[i].getHike();
			}else {
				hikedSalariesArray[i]= "Salary of "+employees[i].getEmpName()+" is " + 
						employees[i].getSalary()+". No Hike";
			}
		}
		return hikedSalariesArray;
	}
	
	// Method-2 to add hike to all the employees

		public Employee[] hikeAdding(Employee[] employees,float hikeAmount) {
			int lengthOfArray = employees.length;
			for (int i = 0; i < lengthOfArray; i++) {
				if (employees[i].getSalary()<35000.00f) {
					employees[i].setSalary(employees[i].getSalary()+hikeAmount);
				}
			}
			return employees;
		}

}
