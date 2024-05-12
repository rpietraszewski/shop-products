package com.rpietraszewski.shopproducts.service;

import com.rpietraszewski.shopproducts.mapper.ProductMapper;
import com.rpietraszewski.shopproducts.model.dto.ProductDTO;
import com.rpietraszewski.shopproducts.model.entity.Product;
import com.rpietraszewski.shopproducts.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductDTO getProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);

        return productMapper.toProductDTO(product);
    }

    public List<ProductDTO> getProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .toList();
    }

    public ProductDTO createProduct(ProductDTO computerDTO) {
        Product newProduct = productMapper.toProduct(computerDTO);
        return productMapper.toProductDTO(productRepository.save(newProduct));
    }
}
