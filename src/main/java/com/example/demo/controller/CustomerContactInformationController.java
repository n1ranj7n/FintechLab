package com.example.demo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerContactInformation;
import com.example.demo.repository.CustomerContactInformationRepository;

@RestController
@RequestMapping("/api/customer-contact-information")
public class CustomerContactInformationController {

    private final CustomerContactInformationRepository repo;

    public CustomerContactInformationController(CustomerContactInformationRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CustomerContactInformation create(@RequestBody CustomerContactInformation body) {
        return repo.save(body);
    }

    @GetMapping
    public List<CustomerContactInformation> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerContactInformation> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerContactInformation> update(@PathVariable Long id, @RequestBody CustomerContactInformation body) {
        return repo.findById(id).map(existing -> {
            existing.setPhone(body.getPhone());
            existing.setEmail(body.getEmail());
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