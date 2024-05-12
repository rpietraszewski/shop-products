package com.rpietraszewski.shopproducts.controller;

import com.rpietraszewski.shopproducts.model.dto.ComputerDTO;
import com.rpietraszewski.shopproducts.service.ComputerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computers")
@RequiredArgsConstructor
public class ComputerController {
    private final ComputerService computerService;

    @GetMapping("{id}")
    public ComputerDTO getComputer(@PathVariable("id") Long id){
        return computerService.getComputer(id);
    }

    @GetMapping
    public List<ComputerDTO> getComputers(){
        return computerService.getComputers();
    }

    @PostMapping
    public ComputerDTO createComputer(@RequestBody ComputerDTO computerDTO){
        return computerService.createComputer(computerDTO);
    }
}
