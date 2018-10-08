package com.example.demo.entity;

import javax.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table (name = "User")

public class user {
    @Id
    @GeneratedValue
    private Long iduse;
    private String name;

    @OneToMany(
            mappedBy="user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Bill> bill = new ArrayList<>();

    @OneToMany(
            mappedBy="user",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<review> review = new ArrayList<>();

    public user(Long iduse,String name){
        this.iduse = iduse;
        this.name = name;

    }
}
