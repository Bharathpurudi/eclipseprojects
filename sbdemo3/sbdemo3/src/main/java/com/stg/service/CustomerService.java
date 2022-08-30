package com.stg.service;

import java.util.List;

import com.stg.model.User;

public interface CustomerService {

	public abstract String createCustomer(User customer);

	public abstract User getCustomer(int userId);

	public abstract List<User> getUsers();

	public abstract String deleteCustomer(int userId);
	
	public abstract User getUserByIdAndName(int userId, String userName);
	
	public abstract User updateUser(User user);

}
