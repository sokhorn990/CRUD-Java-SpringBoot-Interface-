package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	private Long id;
	private String p_name;
	private String brand;
	private String madein;
	private float price;
	public Product() {
		
	}
	public Product(Long id, String name, String brand, String madein, float price) {
		super();
		this.id = id;
		this.p_name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return p_name;
	}
	public void setName(String name) {
		this.p_name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + p_name + ", brand=" + brand + ", madein=" + madein + ", price=" + price
				+ "]";
	}
	
	

}
