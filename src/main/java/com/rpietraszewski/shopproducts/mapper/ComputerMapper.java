package com.rpietraszewski.shopproducts.mapper;

import com.rpietraszewski.shopproducts.model.dto.ComputerDTO;
import com.rpietraszewski.shopproducts.model.entity.Computer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComputerMapper {
    ComputerDTO toComputerDTO(Computer Computer);
    Computer toComputer(ComputerDTO computerDTO);
}
