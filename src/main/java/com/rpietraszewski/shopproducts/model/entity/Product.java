package com.rpietraszewski.shopproducts.model.entity;

import com.rpietraszewski.shopproducts.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private String price;
    private ProductType productType;
    private Boolean availability;
    private String manufacturer;
}