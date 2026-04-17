package com.example.demo.controller;

import com.example.demo.entity.CustomerContactInformation;
import com.example.demo.repository.CustomerContactInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-contact-information")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerContactInformationController {

    @Autowired
    private CustomerContactInformationRepository repository;

    @GetMapping
    public List<CustomerContactInformation> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public CustomerContactInformation save(@RequestBody CustomerContactInformation data) {
        return repository.save(data);
    }
}