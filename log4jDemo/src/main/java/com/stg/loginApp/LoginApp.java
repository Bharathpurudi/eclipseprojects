package com.stg.loginApp;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import LoginModel.User;

public class LoginApp {
	private static final Logger LOGGER = LogManager.getLogger(LoginApp.class);
	public static void main(String[] args) {
		System.out.println("Enter the user name: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		LOGGER.info("Entered username is "+ username);
		System.out.println("Enter the password: ");
		String password = scanner.next();
		LOGGER.info("Entered password is "+ password);
		
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		
		
		
		}

}
