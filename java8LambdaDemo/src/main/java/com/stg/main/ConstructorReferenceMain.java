package com.stg.main;

import com.stg.foreach.Patient;
import com.stg.methodreferance.ConstructorReferanceInterface;


public class ConstructorReferenceMain {
	public static void main(String[] args) {
		ConstructorReferanceInterface interface1 = Patient :: new;
		Patient result = interface1.retrivePatientDetails(25, "qfdgtd", 21);
		System.out.println(result.getPatientName());
	}

}
