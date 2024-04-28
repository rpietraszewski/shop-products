package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Processor extends Product{
    private String memory;
    private String speed;
    private String socket;
    private String cores;
    private String threads;
}
