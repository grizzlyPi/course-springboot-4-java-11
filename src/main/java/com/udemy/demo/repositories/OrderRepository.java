package com.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
