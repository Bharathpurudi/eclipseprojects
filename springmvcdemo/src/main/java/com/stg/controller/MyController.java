package com.stg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping (value="/aa")
	public String hello() {
		return "success";
	}
	@RequestMapping (value = "/bb")
	public String world() {
		return "failure";
	}
}
