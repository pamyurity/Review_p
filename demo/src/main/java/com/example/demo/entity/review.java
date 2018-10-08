package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data

@Table(name="Reviews")
@ToString @EqualsAndHashCode

public class review {
    @Id
    @GeneratedValue
    private String comment;
    private Long id_review;
    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    private user user;

    @ManyToOne(fetch = FetchType.LAZY)
    private room room;

    @OneToOne(fetch = FetchType.EAGER)
    private Bill Bill;


    public review(Long id_review,String comment,int score){
        this.id_review = id_review;
        this.comment = comment;
        this.score = score;
    }
}
