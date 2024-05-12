package com.rpietraszewski.shopproducts.model.dto;

import com.rpietraszewski.shopproducts.enums.ProductType;
import com.rpietraszewski.shopproducts.model.entity.Product;
import lombok.Getter;

import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class ProductDTO {
    private Long id;
    private String name;
    private String price;
    private ProductType productType;
    private Boolean availability;
    private String manufacturer;
    private Set<Product> linkedProducts;
    private Map<String, String> additionalCustomizations;
}
