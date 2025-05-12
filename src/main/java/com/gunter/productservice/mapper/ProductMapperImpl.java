package com.gunter.productservice.mapper;

import com.gunter.productservice.dto.ProductRequestDto;
import com.gunter.productservice.model.Product;
import com.gunter.productservice.model.ProductCategory;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper{
    public Product productRequestDtoToProduct(ProductRequestDto productRequestDto) {
        return  Product.builder().name(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .quantity(productRequestDto.getQuantity())
                .price(productRequestDto.getPrice())
                .category(ProductCategory.builder()
                        .categoryId(productRequestDto.getCategoryId())
                        .build())
                .build();
    }
}
