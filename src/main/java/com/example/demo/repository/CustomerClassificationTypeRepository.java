package com.example.demo.repository;

import com.example.demo.entity.CustomerClassificationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerClassificationTypeRepository extends JpaRepository<CustomerClassificationType, Long> {
}