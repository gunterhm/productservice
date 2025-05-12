package com.gunter.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class ProductCategory {
    @Id
    private Long categoryId;
    private String name;
}
