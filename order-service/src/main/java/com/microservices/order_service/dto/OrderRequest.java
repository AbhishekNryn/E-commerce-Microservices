package com.microservices.order_service.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String oderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
