package com.example.foodCourtEntities.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
