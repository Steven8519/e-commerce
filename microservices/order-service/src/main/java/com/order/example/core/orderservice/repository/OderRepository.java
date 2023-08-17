package com.order.example.core.orderservice.repository;

import com.order.example.core.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OderRepository extends JpaRepository<Order, Long> {
}
