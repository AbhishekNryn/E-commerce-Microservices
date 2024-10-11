package com.microservices.inventory.service;

import com.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode, Integer quantity)
    {
        //find an inventory for the given skuCode where the quantity is >= 0
        return inventoryRepository.existsByskuCodeAndQuantityIsGreaterThanEqual(skuCode,quantity);
    }
}
