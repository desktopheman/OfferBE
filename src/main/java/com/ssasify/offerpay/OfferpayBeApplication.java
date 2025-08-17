package com.ssasify.offerpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ssasify.offerpay")
public class OfferpayBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfferpayBeApplication.class, args);
	}
}
