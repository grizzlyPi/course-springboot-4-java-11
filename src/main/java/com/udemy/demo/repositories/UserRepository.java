package com.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
