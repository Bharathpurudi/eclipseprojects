package com.stg.main;

import com.stg.model.*;

public class MainApp {
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.getEmpId());
		employee.setEmpId(1540);
		System.out.println(employee.getEmpId());
		Department department= new Department();
		department.setDeptId(150);
		System.out.println(department.getDeptId());
		department.setDeptName("STG Training Department");
		System.out.println(department.getDeptName());
		Infrastructure infrastructure = new Infrastructure();
		infrastructure.setTotalNumberOfDepts(10);
		System.out.println(infrastructure.getTotalNumberOfDepts());
	
	}

}
