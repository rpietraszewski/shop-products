package com.rpietraszewski.shopproducts.model.entity;

import com.rpietraszewski.shopproducts.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private String price;
    private ProductType productType;
    private Boolean availability;
    private String manufacturer;
    private Set<Product> linkedProducts = new HashSet<>();
    private Map<String, String> additionalCustomizations = new HashMap<>();
}