package com.rpietraszewski.shopproducts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Computer extends Product{
    private Processor processor;
    private Motherboard motherboard;
    private Case computerCase;
    private GraphicsCard graphicsCard;
    private List<RAM> ram;
    private PowerSupply powerSupply;
    private List<Disk> disks;
}
