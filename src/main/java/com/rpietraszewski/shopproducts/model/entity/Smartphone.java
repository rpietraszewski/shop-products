package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class Smartphone extends Product {
    private String color;
    private String model;
    private String memory;
    private String operatingSystem;
    private String megapixels;
    private String batteryCapacity;
    private Set<Accessory> accessories;
}
