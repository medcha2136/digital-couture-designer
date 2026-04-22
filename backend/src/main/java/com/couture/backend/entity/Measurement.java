package com.couture.backend.entity;

import jakarta.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private Long userId;

private String createdAt;

// all fields
private String chestBust;
private String waistUpper;
private String hipUpper;
private String shoulderWidth;
private String sleeveLength;
private String armhole;
private String neck;
private String garmentLength;
private String waistPant;
private String hipLower;
private String inseamLength;
private String outseamLength;
private String thigh;

private String unit;

// getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getChestBust() {
        return chestBust;
    }

    public void setChestBust(String chestBust) {
        this.chestBust = chestBust;
    }

    public String getWaistUpper() {
        return waistUpper;
    }

    public void setWaistUpper(String waistUpper) {
        this.waistUpper = waistUpper;
    }

    public String getHipUpper() {
        return hipUpper;
    }

    public void setHipUpper(String hipUpper) {
        this.hipUpper = hipUpper;
    }

    public String getShoulderWidth() {
        return shoulderWidth;
    }

    public void setShoulderWidth(String shoulderWidth) {
        this.shoulderWidth = shoulderWidth;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(String sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public String getArmhole() {
        return armhole;
    }

    public void setArmhole(String armhole) {
        this.armhole = armhole;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public String getGarmentLength() {
        return garmentLength;
    }

    public void setGarmentLength(String garmentLength) {
        this.garmentLength = garmentLength;
    }

    public String getWaistPant() {
        return waistPant;
    }

    public void setWaistPant(String waistPant) {
        this.waistPant = waistPant;
    }

    public String getHipLower() {
        return hipLower;
    }

    public void setHipLower(String hipLower) {
        this.hipLower = hipLower;
    }

    public String getInseamLength() {
        return inseamLength;
    }

    public void setInseamLength(String inseamLength) {
        this.inseamLength = inseamLength;
    }

    public String getOutseamLength() {
        return outseamLength;
    }

    public void setOutseamLength(String outseamLength) {
        this.outseamLength = outseamLength;
    }

    public String getThigh() {
        return thigh;
    }

    public void setThigh(String thigh) {
        this.thigh = thigh;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @PrePersist
    public void setDate() {
        this.createdAt = java.time.LocalDateTime.now().toString();
    }
    
}