package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GraphicsCard extends Product{
    private String vram;
    private String clockSpeed;
    private String connectingSlot;
}
