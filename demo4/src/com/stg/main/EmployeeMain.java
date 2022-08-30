package com.stg.main;

import com.stg.model.Employee;
import com.stg.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpId(1540);
		employee1.setEmpName("Bharath");
		employee1.setSalary(35000.00f);
		employee1.setHike(1000.00f);
		
		Employee employee2 = new Employee();
		employee2.setEmpId(1541);
		employee2.setEmpName("Sathish");
		employee2.setSalary(35000.00f);
		employee2.setHike(0.00f);
		
		Employee employee3 = new Employee();
		employee3.setEmpId(1542);
		employee3.setEmpName("Shiyam");
		employee3.setSalary(38000.00f);
		employee3.setHike(1500.00f);
		
		EmployeeService employeeService= new EmployeeService();
		String ans = employeeService.empNameValidation(employee1);
		System.out.println(ans);
		Employee data = employeeService.salaryDifferance(employee1, employee2);
		System.out.println(data.getEmpName()+" " + data.getEmpId());
		Employee[] employees= new Employee[3];
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		float totalSalary= employeeService.budget(employees);
		System.out.println("Budget for March 2022 is: "+totalSalary);
		Employee salariesComparision= employeeService.comapareSalaries(employee1, employee2, employee3);
		System.out.println(salariesComparision.getEmpName()+ " is drawing high salary");
		
		//Invoking method 1
		for (String hikedSalary :employeeService.addingHike(employees)) {
			System.out.println(hikedSalary);
		}
		//Invoking method 2
		for (Employee employee : employeeService.hikeAdding(employees, 1000.00f)) {
			System.out.println("The Hiked salary of "+employee.getEmpName()+" is "+ employee.getSalary());
		}
	}
}
