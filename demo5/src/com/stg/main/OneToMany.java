package com.stg.main;

import com.stg.model.Address;
import com.stg.model.Student;

public class OneToMany {
	public static void main(String[] args) {
		Address address = new Address(12, "Str1", "RDG", "AP");
		Address address1 = new Address(13, "Str2", "HYD", "TS");
		Address address2 = new Address(14, "Str3", "KLR", "KA");
		
		Address[] addresses = new Address[3];
		addresses[0]= address;
		addresses[1]= address1;
		addresses[2]= address2;
		
		Student student = new Student();
		student.setStdId(100);
		System.out.println(student.getStdId());
		student.setStdName("Bharath");
		System.out.println(student.getStdName());
		student.setAddresses(addresses);
		
		Address[] allAddressOfStu = student.getAddresses();
		
		for (Address stuAddress : allAddressOfStu) {
			System.out.println(stuAddress.getDoorNo());
			System.out.println(stuAddress.getCity());
			System.out.println(stuAddress.getState());
			System.out.println(stuAddress.getStreet());
		}
		
	}
}
