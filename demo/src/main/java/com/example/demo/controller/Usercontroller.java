package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Usercontroller {

    private UserRepository repository;
    public Usercontroller(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Users")
    public List<user> user() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
