package com.couture.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;

    private String product;
    private String image;
    private String fabric;
    private String color;

    @Column(length = 2000)
    private String measurements; // store JSON string

    private String time;
}