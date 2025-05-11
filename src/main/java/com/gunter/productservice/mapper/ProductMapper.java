package com.gunter.productservice.mapper;

import com.gunter.productservice.dto.ProductRequestDto;
import com.gunter.productservice.model.Product;


public interface ProductMapper {
    public Product productRequestDtoToProduct(ProductRequestDto productRequestDto);
}
