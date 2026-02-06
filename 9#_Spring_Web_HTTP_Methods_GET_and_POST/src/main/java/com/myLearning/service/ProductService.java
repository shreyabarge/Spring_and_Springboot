package com.myLearning.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myLearning.model.Product;

// Marks this class as a Service component
// Business logic is written here
@Service
public class ProductService {

    // Creates a list of products (temporary hardcoded data)
    // Using ArrayList so we can add new products dynamically
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
    ));

    // Returns the complete list of products
    public List<Product> getProducts() {
        return products;
    }

    // Returns a single product based on product ID
    // Uses simple for-loop (no streams)
    public Product getProductById(int prodId) {

        // Loop through product list
        for (Product product : products) {

            // Check if product ID matches
            if (prodId == product.getProdId()) {
                return product; // product found
            }
        }

        // If product not found, return default object
        return new Product(0, "No Item Found", 0);
    }

    // Adds a new product to the existing product list
    // Called when POST request is made
    public void addProduct(Product prod) {
        products.add(prod);
    }
}
