package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;

@RestController
public class UserController1 {
	@RequestMapping (value = "/user1")
	public User getUser1() {
		return new User(25, "Jyothirmai","ierfh3ifh");
	}

}
