package com.stg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.stg.foreach.Patient;

public class StreamsWithForEach {

	public static void main(String[] args) {
		List<Patient> patientsList = new ArrayList<Patient>();

		patientsList.add(new Patient(1, "Bharath", 25));
		patientsList.add(new Patient(2, "Bharath1", 26));
		patientsList.add(new Patient(3, "Bharath2", 27));
		patientsList.add(new Patient(4, "Bharath3", 28));
		patientsList.add(new Patient(5, "Bharath4", 29));
		patientsList.add(new Patient(6, "Bharath5", 30));
		
		patientsList.stream().forEach((a)->{
			System.out.println(a.getPatientId());
			System.out.println(a.getPatientName());
			System.out.println(a.getPatientAge());
		});
		
		 patientsList.stream().filter((a)->a.getPatientAge()>26).forEach((b)->{
			 System.out.println(b.getPatientName());
		 });
		 
		 List<String> collectedList = new ArrayList<String>();
		collectedList=  patientsList.stream().map(a->a.getPatientName()).collect(Collectors.toList());
		
		collectedList.forEach((System.out::println));
		

	}
}