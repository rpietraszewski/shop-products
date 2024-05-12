package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class Computer extends Product{
    private Processor processor;
    private Motherboard motherboard;
    private Case computerCase;
    private GraphicsCard graphicsCard;
    private Set<RAM> ram;
    private PowerSupply powerSupply;
    private Set<Disk> disks;
}
