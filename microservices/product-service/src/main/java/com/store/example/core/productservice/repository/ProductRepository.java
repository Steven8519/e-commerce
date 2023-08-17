package com.store.example.core.productservice.repository;

import com.store.example.core.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String > {
}
