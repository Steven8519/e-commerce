package com.inventory.service.core.inventoryservice.service;

import com.inventory.service.core.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    List<InventoryResponse> isInStock(List<String> skuCode);
}
