package com.revature.galaxystorerest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.repository.CustomerRepository;

@Service
public class CustomerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void save(Customer customer) {
		LOGGER.info("Customer service starts");
		customerRepository.save(customer);
	}
}
