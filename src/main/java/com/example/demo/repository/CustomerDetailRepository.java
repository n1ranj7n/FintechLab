package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CustomerDetail;

public interface CustomerDetailRepository extends JpaRepository<CustomerDetail, Long> {
}