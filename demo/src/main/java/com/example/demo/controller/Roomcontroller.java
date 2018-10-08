package com.example.demo.controller;

import com.example.demo.entity.room;
import com.example.demo.repository.RoomRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Roomcontroller {

    private RoomRepository repository;
    public Roomcontroller(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Rooms")
    public List<room> room() {
        return repository.findAll().stream()
                .collect(Collectors.toList());
    }
}
