package com.gunter.productservice.controller;

import com.gunter.productservice.dto.ProductRequestDto;
import com.gunter.productservice.service.ProductService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProduct(@Valid @RequestBody ProductRequestDto productRequestDto){
        log.info("HTTP Request Received: POST createProduct");
        return ResponseEntity.ok().body(""+productService.createProduct(productRequestDto));
    }
}
