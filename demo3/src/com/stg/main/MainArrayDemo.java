package com.stg.main;
import com.stg.service.*;
public class MainArrayDemo {

	public static void main(String[] args) {
		int[] numsArray= {10,20,30,40,50,60,70};
		EmployeeService employeeService= new EmployeeService();
		employeeService.sumOfArray(numsArray);
		System.out.println(numsArray[6]);
		int temp=0;
		for(int i=0; i<numsArray.length;i++) {
			temp+= numsArray[i];
		}
		System.out.println(temp);
		String[] fruitsString = {"dgfgf","dugjdfhywgf","dgfdgfd","dgfudfudf","asfdsgdf"};
		System.out.println(employeeService.stringReturning(fruitsString));
		employeeService.printArray(fruitsString);
	}
}
