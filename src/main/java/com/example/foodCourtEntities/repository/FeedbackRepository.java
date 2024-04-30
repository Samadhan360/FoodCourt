package com.example.foodCourtEntities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodCourtEntities.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
