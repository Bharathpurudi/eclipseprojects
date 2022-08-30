package com.main;

import com.model.*;

public class EmployeeMain{

	public static void main(String[] args) {
		ContractEmployee contractEmployee= new ContractEmployee();
		contractEmployee.setEmpName("Bharath");
		System.out.println(contractEmployee.getEmpName());
		Demo demo = new Demo();
		System.out.println(demo.sayHello());
		System.out.println(demo.sayHello1("Bittu"));
		AbstractParent abstractParent = new Child();
		Child child = new Child();
		
		abstractParent.setIntVariable(25);
		
		System.out.println(abstractParent.getIntVariable());
		System.out.println(child.returnMet());
	}                                                                                             

}
