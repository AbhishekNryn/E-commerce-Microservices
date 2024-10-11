package com.microservices.product_servies.controller;

import com.microservices.product_servies.dto.ProductRequest;
import com.microservices.product_servies.dto.ProductResponse;
import com.microservices.product_servies.model.Product;
import com.microservices.product_servies.repository.ProductRepository;
import com.microservices.product_servies.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    private final ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)

    public List<ProductResponse> getAllProducts()
    {
        return productService.getAllProducts();
    }

}
