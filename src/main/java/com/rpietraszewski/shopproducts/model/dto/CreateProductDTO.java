package com.rpietraszewski.shopproducts.model.dto;

import com.rpietraszewski.shopproducts.enums.ProductType;
import com.rpietraszewski.shopproducts.model.entity.Product;

import java.util.Map;
import java.util.Set;

public class CreateProductDTO {
    private Long id;
    private String name;
    private String price;
    private ProductType productType;
    private Boolean availability;
    private String manufacturer;
    private Set<Product> linkedProducts;
    private Map<String, String> additionalCustomizations;
}
