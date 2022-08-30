package com.stg.main;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.stg.model.*;
import com.stg.service.*;

public class HrApplicationMain1 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1540, "Bharath", 'M', 22);
		Employee employee2 = new Employee(1541, "Bittu", 'M', 26);
		Employee employee3 = new Employee(1542, "Chinna", 'M', 27);
		Employee employee4 = new Employee(1543, "Jyothirmai", 'F', 22);
		Employee employee5 = new Employee(1544, "Chinni", 'F', 23);

		List<Employee> employeeList = new ArrayList<Employee>() ;
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		
		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.getEmployeeName());
		}
		
		
	}

}
