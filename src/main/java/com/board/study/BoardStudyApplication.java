package com.board.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing Ȱ��ȭ
@SpringBootApplication
public class BoardStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardStudyApplication.class, args);
	}
}