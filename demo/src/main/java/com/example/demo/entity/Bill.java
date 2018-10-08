package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Bills")
@Data

@ToString @EqualsAndHashCode
public class Bill {
    @Id
    @GeneratedValue

    private Long id_bill;
    private String datein;

    @ManyToOne(fetch = FetchType.LAZY)
    private user user;

    @OneToMany(
            mappedBy="bill",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<room> room = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    private review review;

    public Bill(Long id_bill,String datein){
        this.id_bill = id_bill;
        this.datein = datein;

    }


}
