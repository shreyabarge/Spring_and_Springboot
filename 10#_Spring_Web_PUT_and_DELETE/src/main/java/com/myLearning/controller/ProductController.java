package com.myLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myLearning.model.Product;
import com.myLearning.service.ProductService;

@RestController
public class ProductController {
  @Autowired
  private ProductService service;
  
  @GetMapping("/products")
  public List<Product> getAllProducts() {
	  
	  return service.getProducts();
  }
  
  @GetMapping("/products/{pId}")
  public Product getProductById(@PathVariable("pId") int pid) {
	  
	  return service.getProductById(pid);
  }
  
  @PostMapping("/products")
  public void addProduct(@RequestBody Product p) {
	  System.out.println(p);
	  service.addProduct(p);
  }
  
  @PutMapping("/products")
  public void updateProduct(@RequestBody Product p) {
	  System.out.println(p);
	  service.updateProduct(p);
  }
  
  @DeleteMapping("/products/{prodId}")
  public void deleteProduct(@PathVariable int prodId) {
	  service.deleteProduct(prodId);
  }
  
  
}
