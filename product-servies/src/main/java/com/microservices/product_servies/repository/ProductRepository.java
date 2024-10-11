package com.microservices.product_servies.repository;

import com.microservices.product_servies.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
