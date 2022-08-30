package com.stg.main;

import java.util.Scanner;

import com.stg.model.Student;

public class CommandLineArgument {

	public static void main(String[] args) {
		/*
		 * System.out.println(args[0]); System.out.println(Integer.parseInt(args[4]) +
		 * 100); System.out.println(Float.parseFloat(args[4]) + 100);
		 * 
		 * Integer integer = new Integer(args[4]); System.out.println(integer);
		 * System.out.println(Integer.parseInt("25"));
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter an Integer");
		 * int integerVal = sc.nextInt(); System.out.println("Addition of "+
		 * integerVal+100);
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the student ID");
		int studentId = input.nextInt();
		Student student = new Student();
		student.setStudentId(studentId);
		System.out.println("Enter the student Name");
		String studentName = input.next();
		student.setStudentName(studentName);
		System.out.println("Enter the student english marks");
		float studentMarks = input.nextFloat();
		student.setEnglishMarks(studentMarks);
		
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getEnglishMarks());
		
		input.close();
		
	}

}
