package com.example.demo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerProofOfId;
import com.example.demo.repository.CustomerProofOfIdRepository;

@RestController
@RequestMapping("/api/customer-proof-of-id")
public class CustomerProofOfIdController {

    private final CustomerProofOfIdRepository repo;

    public CustomerProofOfIdController(CustomerProofOfIdRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CustomerProofOfId create(@RequestBody CustomerProofOfId body) {
        return repo.save(body);
    }

    @GetMapping
    public List<CustomerProofOfId> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerProofOfId> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerProofOfId> update(@PathVariable Long id, @RequestBody CustomerProofOfId body) {
        return repo.findById(id).map(existing -> {
            existing.setDocumentName(body.getDocumentName());
            existing.setDocumentUrl(body.getDocumentUrl());
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