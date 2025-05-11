package com.gunter.productservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ProductRequestDto {

    @NotEmpty(message = "The name is required.")
    private String name;
    private Long quantity;
    private Double price;
}
