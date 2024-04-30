package com.example.foodCourtEntities.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Menu;
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
