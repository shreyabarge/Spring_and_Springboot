package com.myLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.myLearning.model.Product;
import com.myLearning.service.ProductService;

@RestController   // Marks this class as REST API Controller
@RequestMapping("/products")   // Base URL for all APIs
public class ProductController {

    @Autowired
    private ProductService service;  
    // Controller calls Service layer methods

    // =====================================================
    // FLOW: Client → Controller → Service → Repo → Database
    // =====================================================

    
    // ----------- GET ALL PRODUCTS -----------
    // Request: GET /products
    @GetMapping
    public List<Product> getAllProducts() {

        // Step 1: Request comes to controller
        // Step 2: Controller calls service method
        // Step 3: Service fetches data from DB via repo
        // Step 4: List<Product> returned as JSON

        return service.getProducts();
    }

    
    // ----------- GET PRODUCT BY ID -----------
    // Request: GET /products/101
    @GetMapping("/{pId}")
    public Product getProductById(@PathVariable int pId) {

        // Step 1: ID taken from URL
        // Step 2: Sent to service layer
        // Step 3: Repo searches in DB
        // Step 4: Product returned (or dummy if not found)

        return service.getProductById(pId);
    }

    
    // ----------- ADD PRODUCT -----------
    // Request: POST /products
    @PostMapping
    public void addProduct(@RequestBody Product p) {

        // Step 1: JSON body → Converted to Product object
        // Step 2: Controller sends object to service
        // Step 3: Service calls repo.save()
        // Step 4: Data stored in DB

        service.addProduct(p);
    }

    
    // ----------- UPDATE PRODUCT -----------
    // Request: PUT /products
    @PutMapping
    public void updateProduct(@RequestBody Product p) {

        // Step 1: Updated product comes in body
        // Step 2: Controller passes to service
        // Step 3: repo.save() updates existing record
        // (Update happens if ID already exists)

        service.updateProduct(p);
    }

    
    // ----------- DELETE PRODUCT -----------
    // Request: DELETE /products/101
    @DeleteMapping("/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {

        // Step 1: ID taken from URL
        // Step 2: Sent to service
        // Step 3: Service calls repo.deleteById()
        // Step 4: Record deleted from DB

        service.deleteProduct(prodId);
    }
}
