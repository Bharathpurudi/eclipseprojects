package com.stg.functionalinterface;

import java.util.List;

import com.stg.foreach.Patient;

@FunctionalInterface
public interface PatientInterface {
	
	public abstract Patient searchPatient(List<Patient> patientsList, int patientId);
	

}
