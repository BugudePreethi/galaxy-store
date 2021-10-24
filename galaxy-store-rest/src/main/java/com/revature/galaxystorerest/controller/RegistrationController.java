package com.revature.galaxystorerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.Customer;
import com.revature.galaxystorerest.service.RegistrationService;
 
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	
	
	@GetMapping("/loginuser/{email}/{password}")
	public Customer loginUser(@PathVariable String email, @PathVariable String password) throws Exception {
		String tempEmailId = email;
		String tempPass = password;
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
