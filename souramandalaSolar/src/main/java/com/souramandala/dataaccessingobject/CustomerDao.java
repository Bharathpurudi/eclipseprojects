package com.souramandala.dataaccessingobject;


import com.souramandala.model.*;

public interface CustomerDao  {
	
	public abstract String createCustomer(Customer customer);
	public abstract Customer readCustomerById(int userId);
	public abstract Customer readCustomerByName(String userName);
	public abstract String updateCustomer(int userId,Customer customer);
	public abstract String deleteCustomer(int userId);
	

}
