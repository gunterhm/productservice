package com.gunter.productservice.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequestDto {

    @NotEmpty(message = "name is required.")
    private String name;
    private Long quantity;
    private Double price;
    @NotNull(message = "categoryId is required.")
    private Long categoryId;
}
