package com.bdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing È°¼ºÈ­
@SpringBootApplication
public class BddApplication {

	public static void main(String[] args) {
		SpringApplication.run(BddApplication.class, args);
	}

}
