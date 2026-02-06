package com.myLearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLearning.model.Product;
import com.myLearning.repository.ProductRepo;

@Service   // Marks as Service layer
public class ProductService {

    @Autowired
    private ProductRepo repo;

    
    // -------- GET ALL PRODUCTS --------
    public List<Product> getProducts() {

        // Step 1: Service calls repository
        // Step 2: Repo fetches all data from DB
        // Step 3: List returned to controller

        return repo.findAll();
    }

    
    // -------- GET PRODUCT BY ID --------
    public Product getProductById(int pId) {

        // Step 1: Repo searches product by ID
        // Step 2: If found → return product
        // Step 3: If not → return dummy object

        return repo.findById(pId)
                   .orElse(new Product(0, "No item found", 0));
    }

    
    // -------- ADD PRODUCT --------
    public void addProduct(Product p) {

        // Step 1: Service receives product from controller
        // Step 2: repo.save() inserts into DB

        repo.save(p);
    }

    
    // -------- UPDATE PRODUCT --------
    public void updateProduct(Product p) {

        // Step 1: Product received with existing ID
        // Step 2: repo.save() updates record

        repo.save(p);
    }

    
    // -------- DELETE PRODUCT --------
    public void deleteProduct(int prodId) {

        // Step 1: ID received from controller
        // Step 2: Repo deletes record from DB

        repo.deleteById(prodId);
    }
}
