package com.myLearning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // Auto-generates getters/setters
@AllArgsConstructor
@NoArgsConstructor
@Entity   // Marks this class as Database Table
public class Product {

    @Id   // Primary Key column
    private int prodId;

    // Column → Product Name
    private String prodName;

    // Column → Price
    private int price;
}
