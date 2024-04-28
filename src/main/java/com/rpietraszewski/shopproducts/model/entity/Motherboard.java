package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Motherboard extends Product {
    private String ramSlots;
    private String maxMemorySupported;
    private String socket;
    private String pcieSlots;
    private String sataSlots;
    private String usbSlots;
    private String hdmiSlots;
    private String m2Slots;
}