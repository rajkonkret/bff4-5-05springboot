package com.example.testH2.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class MyEntityResponse {

    private Long id;
    private String name;
}
