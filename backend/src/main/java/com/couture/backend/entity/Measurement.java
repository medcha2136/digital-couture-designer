package com.couture.backend.entity;

import jakarta.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chest;
    private String waist;
    private String hip;

    public Measurement() {}

    public Measurement(String chest, String waist, String hip) {
        this.chest = chest;
        this.waist = waist;
        this.hip = hip;
    }

    public Long getId() { return id; }

    public String getChest() { return chest; }
    public void setChest(String chest) { this.chest = chest; }

    public String getWaist() { return waist; }
    public void setWaist(String waist) { this.waist = waist; }

    public String getHip() { return hip; }
    public void setHip(String hip) { this.hip = hip; }
}