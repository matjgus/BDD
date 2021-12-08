package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages=("web"))
public class RedsocksProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedsocksProjectApplication.class, args);
	}

}
