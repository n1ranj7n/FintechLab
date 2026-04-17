package com.example.demo.controller;

import com.example.demo.entity.CustomerAddress;
import com.example.demo.repository.CustomerAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-address")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerAddressController {

    @Autowired
    private CustomerAddressRepository repository;

    @GetMapping
    public List<CustomerAddress> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public CustomerAddress save(@RequestBody CustomerAddress data) {
        return repository.save(data);
    }
}