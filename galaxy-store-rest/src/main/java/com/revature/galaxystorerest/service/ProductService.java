package com.revature.galaxystorerest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.galaxystorerest.model.Product;
import com.revature.galaxystorerest.repository.ProductRepository;

@Service
public class ProductService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> list(){
		return productRepository.findAll();
	}

}
