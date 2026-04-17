package com.example.demo.controller;

import com.example.demo.entity.CustomerDetail;
import com.example.demo.repository.CustomerDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-detail")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerDetailController {

    @Autowired
    private CustomerDetailRepository customerDetailRepository;

    @GetMapping
    public List<CustomerDetail> getAllCustomerDetails() {
        return customerDetailRepository.findAll();
    }

    @PostMapping
    public CustomerDetail saveCustomerDetail(@RequestBody CustomerDetail customerDetail) {
        return customerDetailRepository.save(customerDetail);
    }
}