package com.stg.main;

import java.util.ArrayList;
import java.util.List;

import com.stg.foreach.Patient;

public class ForEachMain {

	public static void main(String[] args) {
		List<Patient> patientsList = new ArrayList<Patient>();

		patientsList.add(new Patient(1, "Bharath", 25));
		patientsList.add(new Patient(2, "Bharath1", 26));
		patientsList.add(new Patient(3, "Bharath2", 27));
		patientsList.add(new Patient(4, "Bharath3", 28));
		patientsList.add(new Patient(5, "Bharath4", 29));
		patientsList.add(new Patient(6, "Bharath5", 30));

		patientsList.forEach((patient) -> {
			System.out.println(patient.getPatientId());
			System.out.println(patient.getPatientAge());
			System.out.println(patient.getPatientName());
		});
		
		patientsList.forEach(System.out::println);
	}

}
