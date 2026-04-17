package com.example.demo.repository;

import com.example.demo.entity.CustomerIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerIdentificationRepository extends JpaRepository<CustomerIdentification, Long> {
}