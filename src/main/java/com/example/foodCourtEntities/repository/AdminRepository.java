package com.example.foodCourtEntities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Admin;
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
