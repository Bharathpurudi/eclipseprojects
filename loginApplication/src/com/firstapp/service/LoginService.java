package com.firstapp.service;

import com.firstapp.model.User;

public class LoginService {
	
	public String validateUser(User user) {
		String temp = "";
		if (user.getUserId()== 239 && user.getPassword().equals("secret")) {
			temp = "Welcome to FirstApp";
		}
		else {
			temp = "Invalid Credentials";
		}
		return temp;
	}

}
