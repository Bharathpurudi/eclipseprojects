package com.souramandala1.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.souramandala1.model.Customer;
import com.souramandala1.model.OrderModel;

@Service
public interface CustomerInterface {

	public abstract String createCustomer(Customer customer);

	public abstract Customer readCustomerById(int userId);

	public abstract Customer readCustomerByName(String userName);

	public abstract String updateCustomer(int userId, Customer customer);

	public abstract String deleteCustomer(int userId);
	
	public abstract List<OrderModel> getUserOrdersById(int userId);

}
