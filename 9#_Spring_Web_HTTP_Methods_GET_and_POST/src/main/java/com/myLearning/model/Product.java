package com.myLearning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data generates getters, setters, toString(), equals(), hashCode()
@Data

// Creates constructor with all fields
@AllArgsConstructor

// Creates default constructor (no arguments)
@NoArgsConstructor
public class Product {
	
     // Product ID
     private int prodId;
     
     // Product name
     private String prodName;
     
     // Product price
     private int price;
}
