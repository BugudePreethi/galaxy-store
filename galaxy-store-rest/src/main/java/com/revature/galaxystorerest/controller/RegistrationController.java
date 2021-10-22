package com.revature.galaxystorerest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.User;
import com.revature.galaxystorerest.service.RegistrationService;
 
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && "".equals(tempEmailId) ) {
			User userobj = service.fetchUserByEmailId(tempEmailId);
			if(userobj != null) {
				throw new Exception("user with "+tempEmailId+"is already exist");
			}
		}
		User userObj = null;
		userObj=service.saveUser(user);
		return userObj;
		
	}
	
	@GetMapping("/loginuser")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId =user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempEmailId != null &&tempPass != null) {
			userObj= service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
			
		}
		
		if(userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
	
}
