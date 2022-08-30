package com.stg.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.stg.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee searchEmployeeByNum(Set<Employee> set, int emplId) {
		Employee temp = null;
		for (Iterator<Employee> iterator = set.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getEmployeeId() == emplId) {
				temp = employee;
			}
		}
		return temp;
	}

	@Override
	public Set<Employee> searchEmployeeByName(Set<Employee> set, String emplName) {
		Set<Employee> temp = new HashSet<Employee>() ;
		for (Iterator<Employee> iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee newEmployee = (Employee) object;
				if(newEmployee.getEmployeeName().equalsIgnoreCase(emplName)) {
					temp.add(newEmployee);
				}
			}
		}
		return temp;
	}

	@Override
	public Set<Employee> searchEmployeeByAge(Set<Employee> set, int age) {
		Set<Employee> temp = new HashSet<Employee>() ;
		for (Iterator<Employee> iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee newEmployee = (Employee) object;
				if(newEmployee.getAge()== age) {
					temp.add(newEmployee);
				}
			}
		}
		return temp;
	}

	@Override
	public Set<Employee> searchEmployeeByGender(Set<Employee> set, char empGender) {
		Set<Employee> temp = new HashSet<Employee>() ;
		for (Iterator<Employee> iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee newEmployee = (Employee) object;
				if(newEmployee.getGender()==empGender) {
					temp.add(newEmployee);
				}
			}
		}
		return temp;
	}

}
