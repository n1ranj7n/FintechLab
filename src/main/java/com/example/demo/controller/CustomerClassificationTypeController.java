package com.example.demo.controller;

import com.example.demo.entity.CustomerClassificationType;
import com.example.demo.repository.CustomerClassificationTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer-classification-type")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerClassificationTypeController {

    @Autowired
    private CustomerClassificationTypeRepository customerClassificationTypeRepository;

    @GetMapping
    public List<CustomerClassificationType> getAllCustomerClassificationTypes() {
        return customerClassificationTypeRepository.findAll();
    }

    @PostMapping
    public CustomerClassificationType saveCustomerClassificationType(
            @RequestBody CustomerClassificationType customerClassificationType) {
        return customerClassificationTypeRepository.save(customerClassificationType);
    }
}
