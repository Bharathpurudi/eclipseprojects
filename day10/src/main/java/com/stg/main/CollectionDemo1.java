package com.stg.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.stg.collections.Student;

import day1com.stg.service.StudentService;

public class CollectionDemo1 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		
		Set setCollection= new HashSet();
		Student student1 =new Student(1540, "Bharath", 97.5f);
		Student student2 =new Student(1541, "Bittu", 90.5f);
		Student student3 =new Student(1542, "Chinna", 95.5f);
		setCollection.add(student1);
		setCollection.add(student2);
		setCollection.add(student3);
		
		StudentService service = new StudentService();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the student id you want to search");
		int searchId = input.nextInt();
		Student resultStudent = service.searchStudentById(setCollection, searchId);
		System.out.println(resultStudent.getStuName());
		
		

	}

}
