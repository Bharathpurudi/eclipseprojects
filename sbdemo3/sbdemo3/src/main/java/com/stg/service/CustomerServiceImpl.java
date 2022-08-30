package com.stg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.model.User;
import com.stg.repo.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String createCustomer(User customer) {
		customerRepository.save(customer);
		return "User Created Sucessfully";
	}

	@Override
	public User getCustomer(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		return (List<User>) customerRepository.findAll();
	}

	@Override
	public String deleteCustomer(int userId) {
		customerRepository.deleteById(userId);
		return "User Deleted Successfully";
	}

	@Override
	public User getUserByIdAndName(int userId, String userName) {
		Optional<User> optional =customerRepository.findUserByIdAndName(userId, userName);
		User tempUser=null;
		if(optional.isPresent()) {
			tempUser = optional.get();
		}
		
		return tempUser;
	}

	@Override
	public User updateUser(User user) {
		return customerRepository.save(user);
	}

}
