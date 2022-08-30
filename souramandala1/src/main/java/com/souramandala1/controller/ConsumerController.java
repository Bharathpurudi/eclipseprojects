package com.souramandala1.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.souramandala1.config.ServiceImplConfig;
import com.souramandala1.model.Customer;
import com.souramandala1.model.OrderModel;
import com.souramandala1.service.CustomerServiceImpl;

@RestController
public class ConsumerController {
	ApplicationContext serviceApplicationContext = new AnnotationConfigApplicationContext(ServiceImplConfig.class);
	CustomerServiceImpl customerServiceImpl = serviceApplicationContext.getBean(CustomerServiceImpl.class);

	
	
	@GetMapping(value="getuser/{custId}"  )
	public Customer getCustomerById(@PathVariable int custId) {
		return customerServiceImpl.readCustomerById(custId);
		
	}
	
	@GetMapping(value="getuserbyname/{custName}"  )
	public Customer getCustomerByName(@PathVariable String custName) {
		return customerServiceImpl.readCustomerByName(custName);
		
	}
	
	@PostMapping(value="/createuser", consumes = "application/json", produces = "application/json")
	public String updateUser(@RequestBody Customer customer) {
		return customerServiceImpl.createCustomer(customer);
	}
	
	@PutMapping(value="updateuser/{userId}")
	public String updateTheUser(@RequestBody Customer customer, @PathVariable int userId) {
		return customerServiceImpl.updateCustomer(userId, customer);
	}
	
	@DeleteMapping(value="deleteuser/{userId}")
	public String deleteCustomer(@PathVariable int userId) {
		return customerServiceImpl.deleteCustomer(userId);
	}
	
	@GetMapping(value="/getorders/{custId}")
	public List<OrderModel> getOrdersOfCustomer(@PathVariable int custId){
		return customerServiceImpl.getUserOrdersById(custId);
	}
	
	
	
	
	


}
