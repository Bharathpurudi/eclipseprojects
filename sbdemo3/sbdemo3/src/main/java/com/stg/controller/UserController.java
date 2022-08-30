package com.stg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.User;
import com.stg.service.CustomerServiceImpl;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping(value = "/createuser")
	public String createCustomer(@RequestBody User customer) {
		return customerServiceImpl.createCustomer(customer);
	}

	@GetMapping(value = "getuser/{userId}")
	public User getCustomer(@PathVariable int userId) {
		return customerServiceImpl.getCustomer(userId);
	}

	@DeleteMapping(value = "deleteuser/{userId}")
	public String deleteuser(int userId) {
		return customerServiceImpl.deleteCustomer(userId);
	}
	
	@GetMapping(value="/getusers")
	public List<User> getAllUsers(){
		return customerServiceImpl.getUsers();
	}
	
	
	@GetMapping(value="getuserbyidandname/{userId}/{userName}" )
	public User getUserByIdAndName(@PathVariable int userId,@PathVariable String userName) {
		return customerServiceImpl.getUserByIdAndName(userId, userName);
	}
	
	
	@PutMapping(value="updateuser",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public User updateTheUser(@RequestBody User user) {
		return customerServiceImpl.updateUser(user);
	}

}
