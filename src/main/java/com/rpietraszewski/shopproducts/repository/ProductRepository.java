package com.rpietraszewski.shopproducts.repository;

import com.rpietraszewski.shopproducts.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
