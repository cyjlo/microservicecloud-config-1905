package com.hc.chapter04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hc.chapter04.mapper")
public class Chapter04Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter04Application.class, args);
	}

}
