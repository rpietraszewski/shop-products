package com.rpietraszewski.shopproducts.repository;

import com.rpietraszewski.shopproducts.model.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
