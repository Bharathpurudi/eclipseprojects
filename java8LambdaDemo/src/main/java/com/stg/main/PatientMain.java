package com.stg.main;

import java.util.ArrayList;
import java.util.List;

import com.stg.foreach.Patient;
import com.stg.functionalinterface.PatientInterface;

public class PatientMain {

	public static void main(String[] args) {
		List<Patient> patientsList  = new ArrayList<Patient>();
		
		patientsList.add(new Patient(1, "Bharath", 25));
		patientsList.add(new Patient(2, "Bharath1", 26));
		patientsList.add(new Patient(3, "Bharath2", 27));
		patientsList.add(new Patient(4, "Bharath3", 28));
		patientsList.add(new Patient(5, "Bharath4", 29));
		patientsList.add(new Patient(6, "Bharath5", 30));
		
		PatientInterface patientInterface = (patsList , num)->{
			Patient tempPatient = null;
			for (Patient patient : patsList) {
				if(patient.getPatientId()==num) {
					tempPatient=patient;
				}
			}
			return tempPatient;
		};
		
		Patient resultPatient= patientInterface.searchPatient(patientsList, 2);
		
		if(resultPatient != null) {
			System.out.println(resultPatient.getPatientName());
		}else {
			System.out.println("No patient with the serchd Id");
		}

	}

}
