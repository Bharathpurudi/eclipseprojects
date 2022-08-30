package com.assignments.assignment4.model;

public class Student1 extends AbstractMarks {

	private int subject1Marks;
	private int subject2Marks;
	private int subject3Marks;

	public Student1(int subject1Marks, int subject2Marks, int subject3Marks) {
		super();
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
	}

	@Override
	public float getPercentage() {
		float percentage = (subject1Marks + subject2Marks + subject3Marks) / 3;
		return percentage;
	}

}
