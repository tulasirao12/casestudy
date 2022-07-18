package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
