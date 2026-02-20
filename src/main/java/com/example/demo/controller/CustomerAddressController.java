package com.example.demo.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerAddress;
import com.example.demo.repository.CustomerAddressRepository;

@RestController
@RequestMapping("/api/customer-addresses")
public class CustomerAddressController {

    private final CustomerAddressRepository repo;

    public CustomerAddressController(CustomerAddressRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public CustomerAddress create(@RequestBody CustomerAddress body) {
        return repo.save(body);
    }

    @GetMapping
    public List<CustomerAddress> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerAddress> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerAddress> update(@PathVariable Long id, @RequestBody CustomerAddress body) {
        return repo.findById(id).map(existing -> {
            existing.setHouseNo(body.getHouseNo());
            existing.setStreet(body.getStreet());
            existing.setCity(body.getCity());
            existing.setState(body.getState());
            existing.setPincode(body.getPincode());
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