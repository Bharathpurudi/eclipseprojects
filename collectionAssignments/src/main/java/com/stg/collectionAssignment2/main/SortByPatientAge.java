package com.stg.collectionAssignment2.main;

import java.util.Comparator;

import com.stg.collectionAssignment2.model.Patient;

public class SortByPatientAge implements Comparator<Patient>{

	@Override
	public int compare(Patient p1, Patient p2) {
		if(p1.getPatientAge()==p2.getPatientAge()) {
			return 0;
		}else if(p1.getPatientAge()<p2.getPatientAge()) {
			return -1;
		}
		else {
			return 1;
		}
	}

	

}
