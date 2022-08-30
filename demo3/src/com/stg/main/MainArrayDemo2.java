package com.stg.main;
import com.stg.service.*;

public class MainArrayDemo2 {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		int[] numArray=new int[5]; //Declaration of array
		numArray[0]=5;
		numArray[1]=5;
		numArray[2]=5;
		numArray[3]=5;
		numArray[4]=5;
		System.out.println(employeeService.sumOfArray(numArray));
	}

}
