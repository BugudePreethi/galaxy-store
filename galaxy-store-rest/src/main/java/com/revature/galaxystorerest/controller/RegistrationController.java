package com.revature.galaxystorerest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.service.RegistrationService;

@RestController
public class RegistrationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationService registrationService;

	@PostMapping("/authenticate")
	public List<Customer> getByEmail(@RequestBody Customer credentials) {
		LOGGER.debug("Credentials: {}", credentials.getEmail());
		LOGGER.debug("Credentials: {}", credentials.getPassword());
		return registrationService.getByEmail(credentials.getEmail());
		
	}


}
