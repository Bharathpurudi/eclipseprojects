package com.stg.collectionAssignment2.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.stg.collectionAssignment2.model.Patient;

public class PatientMain {

	public static void main(String[] args) {
		Patient patient1 = new Patient(1050, "Jack", 25, 'M');
		Patient patient2 = new Patient(1087, "Jack1", 26, 'F');
		Patient patient3 = new Patient(1069, "Jack2", 35, 'F');
		Patient patient4 = new Patient(1545, "Jack3", 40, 'M');
		Patient patient5 = new Patient(1682, "Jack4", 28, 'M');
		Patient patient6 = new Patient(1654, "Jack5", 23, 'F');
		
		List<Patient> patientsList = new ArrayList<Patient>();
		Collections.addAll(patientsList, patient1, patient2, patient3, patient4, patient5, patient6);
		Collections.sort(patientsList,new SortByPatientId());
		for (Patient patient : patientsList) {
			System.out.println(patient.getPatientId());
		}
		Collections.sort(patientsList, new SortByPatientAge());
		for (Patient patient : patientsList) {
			System.out.println(patient.getPatientId());
		}

	}

}
