package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CustomerContactInformation;

public interface CustomerContactInformationRepository extends JpaRepository<CustomerContactInformation, Long> {
}