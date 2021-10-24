package com.revature.galaxystorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.galaxystorerest.model.Customer;

@Repository
public interface RegistrationRepository extends JpaRepository<Customer, Integer> {

	public Customer findByEmailIdAndPassword(String email, String password);
}
