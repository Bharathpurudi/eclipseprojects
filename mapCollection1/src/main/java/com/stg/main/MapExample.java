package com.stg.main;

import java.util.HashMap;
import java.util.Map;

import com.stg.model.Student;

public class MapExample {

	private static final String Map = null;

	public static void main(String[] args) {
		Student student1;
		Student student2;
		Student student3;
		Student student4;
		Student student5;
		Map<Integer,Student> map= new HashMap<Integer,Student>();
		
		try {
			student1 = new Student("Bharath", 1540);
			student2 = new Student("Bharat", 1541);
			student3 = new Student("Bhara", 1542);
			student4 = new Student("Bhar", 1543);
			student5 = new Student("Bhar", 1544);
			map.put(student1.getStudentId(), student1);
			map.put(student2.getStudentId(), student2);
			map.put(student3.getStudentId(), student3);
			map.put(student4.getStudentId(), student4);
			map.put(student5.getStudentId(), student5);
			System.out.println(map.get(1540).getStudentName());
			
			
			
		} finally {
			student1= null;
			student2= null;
			student3= null;
			student4= null;
			student5= null;
			
		}
		

	}

}
