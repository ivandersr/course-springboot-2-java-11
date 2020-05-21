package com.salvadot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvadot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
