package com.microservices.product_servies;

import org.springframework.boot.SpringApplication;

public class TestProductServiesApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductServiesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
