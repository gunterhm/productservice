package com.gunter.productservice.service;

import com.gunter.productservice.dto.ProductRequestDto;

public interface ProductService{
    public boolean createProduct(ProductRequestDto productRequestDto);
}
