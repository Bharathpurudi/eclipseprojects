package com.stg.collectionAssignment2.model;

public class Patient {
	private int patientId;
	private String patientName;
	private int patientAge;
	private char patientGender;

	public Patient() {
		super();
	}

	public Patient(int patientId, String patientName, int patientAge, char patientGender) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public char getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(char patientGender) {
		this.patientGender = patientGender;
	}

}
