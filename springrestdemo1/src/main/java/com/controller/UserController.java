package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;
@RestController
public class UserController {
	@RequestMapping (value = "/getuser")
	public User getUser() {
		return new User(10, "Bharath", "Chinna@239");
	}

}
