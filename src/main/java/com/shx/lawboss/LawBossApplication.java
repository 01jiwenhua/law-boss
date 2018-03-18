package com.shx.lawboss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shx.lawboss.dao.*")
public class LawBossApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawBossApplication.class, args);
	}
}
