package com.stg.main;

import com.stg.model.Address;
import com.stg.model.Student;

//Inheritance -- extends -- from parent class to child class
public class AddressMain extends java.lang.Object {
	// Here we invoking the constructor which are having the default values
	public static void main(String[] args) {
		Address address = new Address();
		System.out.println("Door number: " + address.getDoorNo());
		System.out.println("Street is : " + address.getStreet());
		System.out.println("City is : " + address.getCity());
		System.out.println("State is: " + address.getState());

		Address address1 = new Address(16, "Nesepeta", "Rayadurg", "A.P");
		AddressMain addressMain = new AddressMain();
		addressMain.addressFunction(address1);
		Student student = new Student();
		student.setStdId(1540);
		student.setStdName("Bharath");
		//student.setStdAddress(address1);

		//System.out.println("Student name is " + student.getStdName());
		//System.out.println(student.getStdAddress().getCity());

	}

	void addressFunction(Address address) {
		System.out.println("Door number: " + address.getDoorNo());
		System.out.println("Street is : " + address.getStreet());
		System.out.println("City is : " + address.getCity());
		System.out.println("State is: " + address.getState());
	}
}
