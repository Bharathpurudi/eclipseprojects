package com.stg.collections;

public class Student {
	private int stuId;
	private String stuName;
	private float stuMarks;

	public Student() {
		super();
	}

	public Student(int stuId, String stuName, float stuMarks) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public float getStuMarks() {
		return stuMarks;
	}

	public void setStuMarks(float stuMarks) {
		this.stuMarks = stuMarks;
	}

}
