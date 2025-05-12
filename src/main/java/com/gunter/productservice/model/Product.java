package com.gunter.productservice.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private Long quantity;
    private Double price;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private ProductCategory category;
}
