package com.rpietraszewski.shopproducts.model.entity;

import com.rpietraszewski.shopproducts.enums.AccessoryType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Accessory extends Product {
    private AccessoryType accessoryType;
}
