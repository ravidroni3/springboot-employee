package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEmployeeApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootEmployeeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeApplication.class, args);

	}
}