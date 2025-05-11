package com.gunter.productservice.service;

import com.gunter.productservice.dto.ProductRequestDto;
import com.gunter.productservice.mapper.ProductMapper;
import com.gunter.productservice.model.Product;
import com.gunter.productservice.repository.ProductRepository;
import com.gunter.productservice.mapper.ProductMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean createProduct(ProductRequestDto productRequestDto) {
        Product product = productMapper.productRequestDtoToProduct(productRequestDto);
        productRepository.save(product);
        return true;
    }
}
