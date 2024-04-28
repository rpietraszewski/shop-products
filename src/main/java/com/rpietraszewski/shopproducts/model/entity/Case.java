package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Case extends Product{
    private String color;
    private String form;
    private Dimensions Dimensions;
}
