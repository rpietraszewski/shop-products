package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RAM extends Product {
    private String capacity;
    private String speed;
}
