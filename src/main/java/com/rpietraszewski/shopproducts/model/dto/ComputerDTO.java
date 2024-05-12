package com.rpietraszewski.shopproducts.model.dto;

import com.rpietraszewski.shopproducts.model.entity.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class ComputerDTO extends ProductDTO {
    private Processor processor;
    private Motherboard motherboard;
    private Case computerCase;
    private GraphicsCard graphicsCard;
    private Set<RAM> ram;
    private PowerSupply powerSupply;
    private Set<Long> disks;
}
