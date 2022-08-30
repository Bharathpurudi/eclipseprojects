package com.assignments.assignment4.main;

import com.assignments.assignment4.model.*;

public class PercentageMain {

	public static void main(String[] args) {
		Student1 student1 = new Student1(78, 85, 55);
		Student2 student2 = new Student2(85, 75, 95, 96);
		
		System.out.println("Percentage of Student1 is "+ student1.getPercentage());
		System.out.println("Percentage of Student2 is "+ student2.getPercentage());

	}

}
