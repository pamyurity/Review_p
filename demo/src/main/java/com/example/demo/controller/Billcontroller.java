package com.example.demo.controller;

import com.example.demo.entity.Bill;
import com.example.demo.repository.BillRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Billcontroller {
    private BillRepository repository;

    public Billcontroller(BillRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Bills")
    public List<Bill> Bill() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
