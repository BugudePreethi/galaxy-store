package com.revature.galaxystorerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.service.RegistrationService;
 
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	
	
	@PostMapping("/loginuser")
	public Customer loginUser(@RequestBody Customer customer) throws Exception {
		String tempEmailId =customer.getEmail();
		String tempPass = customer.getPassword();
		Customer customerObj = null;
		if(tempEmailId != null &&tempPass != null) {
			customerObj= service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		
		if(customerObj == null) {
			throw new Exception("Bad credentials");
		}
		return customerObj;
	}
	
}
