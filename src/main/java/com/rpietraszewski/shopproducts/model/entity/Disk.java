package com.rpietraszewski.shopproducts.model.entity;

import com.rpietraszewski.shopproducts.enums.DiskType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Disk extends Product {
    private String capacity;
    private DiskType diskType;
}
