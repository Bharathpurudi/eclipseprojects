package com.assignments.assignment4.model;

public class Student2 extends AbstractMarks {

	private int subject1Marks;
	private int subject2Marks;
	private int subject3Marks;
	private int subject4Marks;

	public Student2(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
		super();
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		this.subject3Marks = subject3Marks;
		this.subject4Marks = subject4Marks;
	}

	@Override
	public float getPercentage() {
		float percentage = (subject1Marks+subject2Marks+subject3Marks+subject4Marks)/4;
		return percentage;
	}

}
