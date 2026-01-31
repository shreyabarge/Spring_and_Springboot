package com.myLearning.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.myLearning.model.Product;

// Marks this class as a Service component
// Business logic is written here
@Service
public class ProductService {
	
	// Creates a list of products (temporary hardcoded data)
	List<Product> products = Arrays.asList(
			                 new Product(101, "Iphone", 50000),
			                 new Product(102, "Canon Camera", 70000),
			                 new Product(103, "Shure Mic", 10000));
    
	// Method to return all products
	public List<Product> getProduct(){
		
		return products;
	}
}
