package com.stg.main; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stg.model.Student;

public class StudentMainDemo1 {

	public static void main(String[] args) {
		// load the config file --> through the container --> ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/stg/configarationfiles/studentconfig.xml");
		Student student=  (Student) applicationContext.getBean("student"); //IOC
		Student student1=  (Student) applicationContext.getBean("student1");
		System.out.println(student1.getStudentId());
		
		Student student2 = student1;
		student2.setStudentId(242);
		System.out.println(student2.getStudentId());
		
		
	}

}
