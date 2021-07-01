package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Product;
import com.spring.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public List<Product> listAll(){
		return pr.findAll();
	}
	public void save(Product product) {
		pr.save(product);
	}
	public Product get(long id) {
	    return pr.findById(id).get();
	}
	     
	public void delete(long id) {
		pr.deleteById(id);
	}

}
