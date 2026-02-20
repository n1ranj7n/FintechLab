package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CustomerProofOfId;

public interface CustomerProofOfIdRepository extends JpaRepository<CustomerProofOfId, Long> {
}