package com.microservices.inventory.repository;

import com.microservices.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    boolean existsByskuCodeAndQuantityIsGreaterThanEqual(String skuCode,Integer quantity);
}