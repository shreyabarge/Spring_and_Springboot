package com.myLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.myLearning.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    // No implementation needed ❌
    // Spring Data JPA provides inbuilt methods:

    // save()        → Insert / Update
    // findAll()     → Get all records
    // findById()    → Get by ID
    // deleteById()  → Delete record
}
