package com.stg.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.stg.model.*;
import com.stg.service.*;

public class HrApplicationMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1540, "Bharath", 'M', 22);
		Employee employee2 = new Employee(1541, "Bittu", 'M', 26);
		Employee employee3 = new Employee(1542, "Chinna", 'M', 27);
		Employee employee4 = new Employee(1543, "Jyothirmai", 'F', 22);
		Employee employee5 = new Employee(1544, "Chinni", 'F', 23);

		Set<Employee> set = new HashSet<Employee>();
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		set.add(employee5);

		for (Iterator<Employee> iterator = set.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println("Name of the employee is " + employee.getEmployeeName());

		}

		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

		String employeeName = employeeServiceImpl.searchEmployeeByNum(set, 1540).getEmployeeName();
		System.out.println(employeeName);
		
		Set<Employee> employeeNames = employeeServiceImpl.searchEmployeeByName(set, "chinna");
		for (Iterator<Employee> iterator = employeeNames.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println(employee.getEmployeeName());
		}
		
		Set<Employee> employeeNamesByAge = employeeServiceImpl.searchEmployeeByAge(set, 22);
		for (Iterator<Employee> iterator = employeeNamesByAge.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println(employee.getEmployeeName());
		}
		
		Set<Employee> employeeNamesByGender = employeeServiceImpl.searchEmployeeByGender(set, 'F');
		for (Iterator<Employee> iterator = employeeNamesByGender.iterator(); iterator.hasNext();) {
			Employee employee = iterator.next();
			System.out.println(employee.getEmployeeName());
		}

	}

}
