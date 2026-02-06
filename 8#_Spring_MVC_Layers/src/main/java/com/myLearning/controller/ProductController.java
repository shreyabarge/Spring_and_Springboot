package com.myLearning.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myLearning.model.Product;
import com.myLearning.service.ProductService;

// Marks this class as a REST controller
// It handles HTTP requests and sends responses in JSON format
@RestController
public class ProductController {
	
	// Injects ProductService object automatically
	@Autowired
	ProductService service;
	
	// Maps HTTP request "/products" to this method
   @RequestMapping("/products")
	public List<Product> getProducts() {
		
		// Calls service layer method and returns product list
		return service.getProduct();
	}
}
