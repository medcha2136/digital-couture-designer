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
    private Long measurementId;

    //add getters and setters if not using Lombok
    public Long getId() {
        return id;
    }   
    public void setId(Long id) {
        this.id = id;
    }
    public String getFabric() {
        return fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getMeasurementId() {
        return measurementId;
    }
    public void setMeasurementId(Long measurementId) {
        this.measurementId = measurementId;
    }
    
}