package com.example.demo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerDetail;
import com.example.demo.repository.CustomerDetailRepository;

@RestController
@RequestMapping("/api/customer-details")
public class CustomerDetailController {

    private final CustomerDetailRepository repo;

    public CustomerDetailController(CustomerDetailRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CustomerDetail create(@RequestBody CustomerDetail body) {
        return repo.save(body);
    }

    @GetMapping
    public List<CustomerDetail> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDetail> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDetail> update(@PathVariable Long id, @RequestBody CustomerDetail body) {
        return repo.findById(id).map(existing -> {
            existing.setFullName(body.getFullName());
            existing.setAge(body.getAge());
            existing.setGender(body.getGender());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}