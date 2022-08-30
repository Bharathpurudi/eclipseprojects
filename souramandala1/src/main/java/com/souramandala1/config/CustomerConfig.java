package com.souramandala1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.souramandala1.model.Customer;

@Configuration
@ComponentScan (basePackages = "com.souramandala1.model")
public class CustomerConfig {
	
	public Customer customerCon() {
		return new Customer();
	}

}

