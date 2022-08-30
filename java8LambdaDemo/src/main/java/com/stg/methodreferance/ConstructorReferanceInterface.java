package com.stg.methodreferance;

import com.stg.foreach.Patient;

@FunctionalInterface
public interface ConstructorReferanceInterface {
	
	public abstract Patient retrivePatientDetails(int patientId, String patientName, int patientAge);

}
