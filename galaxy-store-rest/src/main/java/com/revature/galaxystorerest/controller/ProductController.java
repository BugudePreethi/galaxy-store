package com.revature.galaxystorerest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.galaxystorerest.model.Product;
import com.revature.galaxystorerest.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.list();
	}
}
