package com.revature.galaxystorerest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.galaxystorerest.model.Customer;

@Repository
public interface RegistrationRepository extends JpaRepository<Customer, Integer> {
	@Query("select c from Customer c where c.email = :email")
	List<Customer> findByEmail(@Param("email") String email);
}
