package com.revature.galaxystorerest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public void create(@RequestBody Customer customer) {
		LOGGER.debug("Customer: {}", customer);
		customerService.save(customer);
	}
}