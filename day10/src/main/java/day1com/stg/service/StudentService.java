package day1com.stg.service;

import java.util.Iterator;
import java.util.Set;

import com.stg.collections.Student;

public class StudentService {
	public Student searchStudentById(Set set, int id) {
		Student temp = null;
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();

			if (student.getStuId() == id) {
				temp = student;
			}
		}
		return temp;

	}
}
