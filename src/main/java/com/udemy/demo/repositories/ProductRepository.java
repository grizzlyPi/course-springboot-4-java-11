package com.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
