package com.example.foodCourtEntities.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Payment;
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
