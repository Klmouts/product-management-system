package com.example.productmanagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.productmanagement.repository")
public class ProductManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApplication.class, args);
	}

}