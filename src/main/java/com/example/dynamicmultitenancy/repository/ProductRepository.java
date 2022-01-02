package com.example.dynamicmultitenancy.repository;


import com.example.dynamicmultitenancy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
