package com.firstapp.main;

import com.firstapp.model.User;
import com.firstapp.service.LoginService;

public class LoginApp {

	public static void main(String[] args) {
		User user = new User(239, "secret") ;
		LoginService loginService = new LoginService();
		String loginMsg = loginService.validateUser(user);
		System.out.println(loginMsg);

	}

}
