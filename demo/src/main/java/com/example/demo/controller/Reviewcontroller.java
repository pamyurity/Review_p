package com.example.demo.controller;

import com.example.demo.entity.review;
import com.example.demo.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Reviewcontroller {

    private ReviewRepository repository;
    public Reviewcontroller(ReviewRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Reviews")
    public List<review> review() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
