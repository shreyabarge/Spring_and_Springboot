package com.myLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // Handles HTTP GET request to fetch all products
    // URL: http://localhost:8080/products
    @GetMapping("/products")
    public List<Product> getProducts() {

        // Calls service layer method and returns product list
        return service.getProducts();
    }

    // Handles HTTP GET request to fetch product by ID
    // URL: http://localhost:8080/products/{prodId}
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {

        // Calls service method to get product by ID
        return service.getProductById(prodId);
    }

    // Handles HTTP POST request to add a new product
    // URL: http://localhost:8080/products
    // Request body contains product details in JSON format
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {

        // Prints product object in console (for debugging)
        System.out.println(prod);

        // Calls service method to add product
        service.addProduct(prod);
    }
}
