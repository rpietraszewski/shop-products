package com.rpietraszewski.shopproducts.mapper;

import com.rpietraszewski.shopproducts.model.dto.ProductDTO;
import com.rpietraszewski.shopproducts.model.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toProductDTO(Product product);
    Product toProduct(ProductDTO productDTO);
}
