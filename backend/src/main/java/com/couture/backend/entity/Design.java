package com.couture.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "design")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Design {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fabric;
    private String color;
    private Long userId;
}