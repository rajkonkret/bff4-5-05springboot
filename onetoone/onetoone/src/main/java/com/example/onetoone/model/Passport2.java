package com.example.onetoone.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Passport2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person2_id")
    private Person2 person2;
}
