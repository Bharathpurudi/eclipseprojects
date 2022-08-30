package com.souramandala.main;

import java.util.Scanner;

import com.souramandala.model.Customer;
import com.souramandala.service.CustomerServiceImpl;

public class ConsumerMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {

			/*
			 * System.out.println("Enter the user id: "); int customerId = input.nextInt();
			 * System.out.println("Enter the user name: "); String customerName =
			 * input.next(); System.out.println("Enter the user password: "); String
			 * customerPassword = input.next();
			 * System.out.println("Enter the user location: "); String customerLocation =
			 * input.next(); System.out.println("Enter the user mob no with +91 : "); String
			 * customerMobNo = input.next(); System.out.println("Enter the user mail: ");
			 * String customerMailId = input.next(); Customer customer = new
			 * Customer(customerId, customerName, customerPassword, customerLocation,
			 * customerMobNo, customerMailId);
			 */

			CustomerServiceImpl customerDaoImpl = new CustomerServiceImpl();
			//System.out.println(customerDaoImpl.createCustomer(customer));
			/*
			 * System.out.println("Enter the user id you want to search: "); int userInput =
			 * input.nextInt(); Customer searchedCustomerById =
			 * customerDaoImpl.readCustomerById(userInput); if (searchedCustomerById !=
			 * null) { System.out.println(searchedCustomerById.getUserId());
			 * System.out.println(searchedCustomerById.getUserName());
			 * System.out.println(searchedCustomerById.getPassword());
			 * System.out.println(searchedCustomerById.getLocation());
			 * System.out.println(searchedCustomerById.getMobileNum());
			 * System.out.println(searchedCustomerById.getMailId()); } else {
			 * System.out.println("No user with the searched id"); }
			 * System.out.println("Enter the user Name you want to search: "); String
			 * userInputByName = input.next(); Customer searchedCustomerByName =
			 * customerDaoImpl.readCustomerByName(userInputByName); if
			 * (searchedCustomerByName != null) {
			 * System.out.println(searchedCustomerByName.getUserId());
			 * System.out.println(searchedCustomerByName.getUserName());
			 * System.out.println(searchedCustomerByName.getPassword());
			 * System.out.println(searchedCustomerByName.getLocation());
			 * System.out.println(searchedCustomerByName.getMobileNum());
			 * System.out.println(searchedCustomerByName.getMailId()); } else {
			 * System.out.println("No user with the searched Name"); }
			 */

			System.out.println("Enter the userid whose details to be updated: ");
			int updatingUserId = input.nextInt();
			System.out.println("Enter the user id: ");
			int updatingCustomerId = input.nextInt();
			System.out.println("Enter the updating user name: ");
			String updatingCustomerName = input.next();
			System.out.println("Enter the updating user password: ");
			String updatingCustomerPassword = input.next();
			System.out.println("Enter the updating user location: ");
			String updatingCustomerLocation = input.next();
			System.out.println("Enter the updating user mob no with +91 : ");
			String updatingCustomerMobNo = input.next();
			System.out.println("Enter the updating user mail: ");
			String updatingCustomerMailId = input.next();

			Customer updatingCustomer = new Customer(updatingCustomerId, updatingCustomerName, updatingCustomerPassword,
					updatingCustomerLocation, updatingCustomerMobNo, updatingCustomerMailId);
			System.out.println(customerDaoImpl.updateCustomer(updatingUserId, updatingCustomer));

			System.out.println("Enter the user id of user whose details to delete: ");
			int deletingUserId = input.nextInt();
			System.out.println(customerDaoImpl.deleteCustomer(deletingUserId));

		} finally {
			input.close();
		}

	}

}
