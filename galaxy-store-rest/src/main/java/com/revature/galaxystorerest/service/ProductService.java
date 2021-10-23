package com.revature.galaxystorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.galaxystorerest.model.Product;
import com.revature.galaxystorerest.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	
	public List<Product> listAll(String keyword) {
		if (keyword!=null) {
			return repo.findAll(keyword);
		}
		return null;
	}
	
	

}
