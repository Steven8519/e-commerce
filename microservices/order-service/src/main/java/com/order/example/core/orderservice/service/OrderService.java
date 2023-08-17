package com.order.example.core.orderservice.service;

import com.order.example.core.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
