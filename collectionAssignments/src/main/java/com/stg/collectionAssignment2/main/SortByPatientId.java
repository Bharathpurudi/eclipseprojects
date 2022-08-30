package com.stg.collectionAssignment2.main;

import java.util.Comparator;
import com.stg.collectionAssignment2.model.*;

public class SortByPatientId implements Comparator<Patient> {
	
	@Override
	public int compare(Patient patient1, Patient patient2) {
		if(patient1.getPatientId()==patient2.getPatientId()) {
			return 0;
		}else if(patient1.getPatientId() < patient2.getPatientId()) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
