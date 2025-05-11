package com.gunter.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductCategory {
    @Id
    private Long categoryId;
    private String name;
}
