package com.rpietraszewski.shopproducts.controller;

import com.rpietraszewski.shopproducts.model.dto.ProductDTO;
import com.rpietraszewski.shopproducts.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable("id") Long id) {
        return productService.getProduct(id);
    }

    @GetMapping
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }
}
