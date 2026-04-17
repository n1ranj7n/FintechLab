package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_name")
public class CustomerName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerIdentifier;
    private String customerNameType;
    private String customerNameValue;
    private Long customerDetailId;
    private String createdUserId;

    public CustomerName() {
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerIdentifier() {
        return customerIdentifier;
    }

    public void setCustomerIdentifier(Long customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    public String getCustomerNameType() {
        return customerNameType;
    }

    public void setCustomerNameType(String customerNameType) {
        this.customerNameType = customerNameType;
    }

    public String getCustomerNameValue() {
        return customerNameValue;
    }

    public void setCustomerNameValue(String customerNameValue) {
        this.customerNameValue = customerNameValue;
    }

    public Long getCustomerDetailId() {
        return customerDetailId;
    }

    public void setCustomerDetailId(Long customerDetailId) {
        this.customerDetailId = customerDetailId;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }
}