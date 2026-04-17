package com.example.demo.controller;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.repository.CustomerProofOfIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-proof-of-id")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerProofOfIdController {

    @Autowired
    private CustomerProofOfIdRepository repository;

    @GetMapping
    public List<CustomerProofOfId> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public CustomerProofOfId save(@RequestBody CustomerProofOfId data) {
        return repository.save(data);
    }
}