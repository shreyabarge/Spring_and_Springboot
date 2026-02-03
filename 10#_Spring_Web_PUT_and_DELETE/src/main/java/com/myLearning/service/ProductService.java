package com.myLearning.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.myLearning.model.Product;

@Component
public class ProductService {
  
	List<Product> products = new ArrayList<> (Arrays.asList(new Product(101, "IPhone", 50000),new Product(102, "Canon Camera", 30000), new Product(103, "Shure Mic", 10000)));
	
	public List<Product> getProducts() {
		
		return products;
	}
	
	public Product getProductById(int pId) {
		for(Product product: products ) {
			if(pId==product.getProdId()) {
				return product;
			}
		}
		return new Product(100, "No item found", 0);
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}

	public void updateProduct(Product p) {
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getProdId()==p.getProdId()){
				products.set(i , p);
			}
		}
	}
	
	public void deleteProduct(int prodId) {
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getProdId()==prodId){
				products.remove(i);
			}
		}
	}
}
