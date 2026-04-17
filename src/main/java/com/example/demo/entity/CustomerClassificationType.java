package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_classification_type")
public class CustomerClassificationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerIdentifier;
    private String customerClassificationType;
    private String customerClassificationValue;
    private Long customerNameId;
    private Long customerDetailId;
    private String effectiveDate;
    private String createdUserId;

    public CustomerClassificationType() {
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

    public String getCustomerClassificationType() {
        return customerClassificationType;
    }

    public void setCustomerClassificationType(String customerClassificationType) {
        this.customerClassificationType = customerClassificationType;
    }

    public String getCustomerClassificationValue() {
        return customerClassificationValue;
    }

    public void setCustomerClassificationValue(String customerClassificationValue) {
        this.customerClassificationValue = customerClassificationValue;
    }

    public Long getCustomerNameId() {
        return customerNameId;
    }

    public void setCustomerNameId(Long customerNameId) {
        this.customerNameId = customerNameId;
    }

    public Long getCustomerDetailId() {
        return customerDetailId;
    }

    public void setCustomerDetailId(Long customerDetailId) {
        this.customerDetailId = customerDetailId;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }
}