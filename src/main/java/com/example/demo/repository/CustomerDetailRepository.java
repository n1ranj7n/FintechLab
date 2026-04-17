package com.example.demo.repository;

import com.example.demo.entity.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailRepository extends JpaRepository<CustomerDetail, Long> {
}