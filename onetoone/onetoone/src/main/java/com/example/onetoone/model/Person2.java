package com.example.onetoone.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Person2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // dwukierunkowa
    @OneToOne(mappedBy = "person2", cascade = CascadeType.ALL, orphanRemoval = true)
    private Passport2 passport2;
}
