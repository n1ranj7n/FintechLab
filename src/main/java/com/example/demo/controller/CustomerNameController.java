package com.example.demo.controller;

import com.example.demo.entity.CustomerName;
import com.example.demo.repository.CustomerNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-name")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerNameController {

    @Autowired
    private CustomerNameRepository customerNameRepository;

    @GetMapping
    public List<CustomerName> getAllCustomerNames() {
        return customerNameRepository.findAll();
    }

    @PostMapping
    public CustomerName saveCustomerName(@RequestBody CustomerName customerName) {
        return customerNameRepository.save(customerName);
    }
}