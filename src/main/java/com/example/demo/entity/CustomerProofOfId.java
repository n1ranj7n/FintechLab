package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_proof_of_id")
public class CustomerProofOfId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerIdentifier;
    private String customerProofOfIdType;
    private String customerProofOfIdValue;
    private String startDate;
    private String endDate;
    private String effectiveDate;
    private Long customerDetailId;
    private String createdUserId;

    public CustomerProofOfId() {
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

    public String getCustomerProofOfIdType() {
        return customerProofOfIdType;
    }

    public void setCustomerProofOfIdType(String customerProofOfIdType) {
        this.customerProofOfIdType = customerProofOfIdType;
    }

    public String getCustomerProofOfIdValue() {
        return customerProofOfIdValue;
    }

    public void setCustomerProofOfIdValue(String customerProofOfIdValue) {
        this.customerProofOfIdValue = customerProofOfIdValue;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
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