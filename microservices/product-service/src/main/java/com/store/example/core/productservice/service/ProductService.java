package com.store.example.core.productservice.service;

import com.store.example.core.productservice.dto.ProductRequest;
import com.store.example.core.productservice.dto.ProductResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {
    void createProduct(@RequestBody ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
