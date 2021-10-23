package com.revature.galaxystorerest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	
	@Autowired
	private RegistrationRepository repo;
	
	public Customer saveUser(Customer customer) {
		return repo.save(customer);
		
	}
	

	
	public Customer fetchUserByEmailIdAndPassword(String email,String password) {
		return repo.findByEmailIdAndPassword(email, password);
		
	}

}
