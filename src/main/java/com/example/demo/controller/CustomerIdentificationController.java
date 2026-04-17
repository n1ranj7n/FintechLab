package com.example.demo.controller;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.repository.CustomerIdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-identification")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerIdentificationController {

    @Autowired
    private CustomerIdentificationRepository repository;

    @GetMapping
    public List<CustomerIdentification> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public CustomerIdentification save(@RequestBody CustomerIdentification data) {
        return repository.save(data);
    }
}