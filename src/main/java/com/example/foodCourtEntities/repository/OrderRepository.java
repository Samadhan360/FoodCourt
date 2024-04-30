package com.example.foodCourtEntities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Order;
public interface OrderRepository extends JpaRepository<Order, Long>{

}
