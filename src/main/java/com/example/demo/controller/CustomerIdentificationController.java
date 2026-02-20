package com.example.demo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerIdentification;
import com.example.demo.repository.CustomerIdentificationRepository;

@RestController
@RequestMapping("/api/customer-identifications")
public class CustomerIdentificationController {

    private final CustomerIdentificationRepository repo;

    public CustomerIdentificationController(CustomerIdentificationRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CustomerIdentification create(@RequestBody CustomerIdentification body) {
        return repo.save(body);
    }

    @GetMapping
    public List<CustomerIdentification> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerIdentification> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerIdentification> update(@PathVariable Long id, @RequestBody CustomerIdentification body) {
        return repo.findById(id).map(existing -> {
            existing.setIdType(body.getIdType());
            existing.setIdNumber(body.getIdNumber());
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