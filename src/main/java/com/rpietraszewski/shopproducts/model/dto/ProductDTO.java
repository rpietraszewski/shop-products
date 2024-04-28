package com.rpietraszewski.shopproducts.model.dto;

import com.rpietraszewski.shopproducts.enums.ProductType;
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
}
