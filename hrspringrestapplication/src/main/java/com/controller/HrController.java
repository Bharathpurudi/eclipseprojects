package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Employee;

@RestController
public class HrController {
	@RequestMapping(value = "getdepartment", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Department getDepartment() {
		Employee employee = new Employee(1540, "Bharath", "Training", 30000.00f);
		Employee employee1 = new Employee(1541, "Chinna", "R&D", 40000.00f);
		Employee employee2 = new Employee(1542, "Bittu", "Finance", 50000.00f);
		Employee employee3 = new Employee(1543, "Jyothirmai", "Admin", 60000.00f);
		Employee employee4 = new Employee(1544, "Chinni", "Development", 70000.00f);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);

		Department department = new Department(121, "H&R", "Chennai", employees);

		return department;

	}

	@RequestMapping(value = "search/{id}", method = RequestMethod.GET)
	public Employee searchByEmployee(@PathVariable("id") int empId) {
		Employee employee = null;
		if (empId == 1540) {
			employee = new Employee(1540, "Bharath", "Training", 300000.0f);
		}
		if (empId == 1541) {
			employee = new Employee(1541, "Bharath", "Training", 300000.0f);
		}
		if (empId == 1542) {
			employee = new Employee(1542, "Bharath", "Training", 300000.0f);
		}

		return employee;
	}

	 @RequestMapping(path = "searchbyname/{empId}/{empName}", method = RequestMethod.GET)
	public Employee searchByEmployeeByIdAndName(@PathVariable int empId, @PathVariable String empName) {
		Employee employee = null;
		if (empId == 1540 && empName.equalsIgnoreCase("Bharath")) {
			employee = new Employee(1540, "Bharath", "Training", 300000.0f);
		}
		if (empId == 1541 && empName.equals("Chinna")) {
			employee = new Employee(1541, "Chinna", "R&D", 40000.00f);
		}
		if (empId == 1542 && empName.equals("Bittu")) {
			employee = new Employee(1542, "Bittu", "Finance", 50000.00f);
		}

		return employee;
	}
	 @PostMapping(value="/create")
	 public Department createDepartment(@RequestBody Department department) {
		 System.out.println(department.getDeptId());
		 return department;
	 }
	 @PutMapping(value="updatedept/{deptName}")
	 public Department updateDepartmentName(@PathVariable String deptName) {
		 Department department1 = new Department();
		 department1.setDeptId(123);
		 department1.setDeptName(deptName);
		 department1.setDeptLocation("New Delhi");
		 return department1;
	 }
	 
	 @PutMapping(value="updateemp/{deptName}")
	 public Department updateDepartmentNameAndEmployees(@RequestBody Employee employee ,@PathVariable String deptName) {
		 Department department1 = new Department();
		 department1.setDeptId(123);
		 department1.setDeptName(deptName);
		 department1.setDeptLocation("New Delhi");
		 List<Employee> employees = new ArrayList<Employee>();
		 employees.add(employee);
		 department1.setEmployees(employees);
		 return department1;
	 }
	 
	 @DeleteMapping(value="delete/{deptId}")
	 public Department deleteEmployee(@RequestBody Employee employee ,@PathVariable int deptId) {
		 Department department1 = new Department();
		 department1.setDeptId(deptId);
		 department1.setDeptName("Q&A");
		 department1.setDeptLocation("New Delhi");
		 List<Employee> employees = new ArrayList<Employee>();
		 employees.add(employee);
		 department1.setEmployees(employees);
		 return department1;
	 }
	


}
