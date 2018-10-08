package com.example.demo.entity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Rooms")
@Data

@ToString @EqualsAndHashCode
public class room {
    @Id
    @GeneratedValue

    private Long id_room;
    private String name_room;


    @OneToMany(
            mappedBy="room",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<review> review = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Bill bill;

    public room(Long id_room,String name_room){
        this.id_room = id_room;
        this.name_room = name_room;

    }

}
