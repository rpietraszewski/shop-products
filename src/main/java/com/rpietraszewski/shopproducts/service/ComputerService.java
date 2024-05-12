package com.rpietraszewski.shopproducts.service;

import com.rpietraszewski.shopproducts.mapper.ComputerMapper;
import com.rpietraszewski.shopproducts.model.dto.ComputerDTO;
import com.rpietraszewski.shopproducts.model.entity.Computer;
import com.rpietraszewski.shopproducts.model.entity.Product;
import com.rpietraszewski.shopproducts.repository.ComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputerService {
    private final ComputerRepository computerRepository;
    private final ComputerMapper computerMapper;

    public ComputerDTO getComputer(Long id){
        Computer computer = computerRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);

        return computerMapper.toComputerDTO(computer);
    }

    public List<ComputerDTO> getComputers(){
        return computerRepository.findAll().stream()
                .map(computerMapper::toComputerDTO)
                .toList();
    }

    public ComputerDTO createComputer(ComputerDTO computerDTO){
        Computer newComputer = computerMapper.toComputer(computerDTO);
        return computerMapper.toComputerDTO(computerRepository.save(newComputer));
    }
}
