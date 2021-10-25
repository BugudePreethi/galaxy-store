package com.revature.galaxystorerest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.repository.RegistrationRepository;

@Service
public class RegistrationService {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationService.class);

	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public List<Customer> getByEmail(String email){
		LOGGER.debug("Name: {}", email);
		return registrationRepository.findByEmail(email);
	}


}
