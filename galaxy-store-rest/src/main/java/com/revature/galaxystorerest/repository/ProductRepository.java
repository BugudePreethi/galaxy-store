package com.revature.galaxystorerest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.galaxystorerest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
	@Query("select p from products p where p.name LIKE %?1%")
	public List<Product> findAll(String keyword);
}
