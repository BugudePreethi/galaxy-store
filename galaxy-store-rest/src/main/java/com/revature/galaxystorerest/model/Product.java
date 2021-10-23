package com.revature.galaxystorerest.model;

public class Product {
	
	String name;
	int price;
	String brand;
	double id;
	
	
	
	public Product() {
		
	}
	
	
	
	public Product(String name, int price, String brand, double id) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	
	

}
