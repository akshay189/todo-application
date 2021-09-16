package com.akshay.incubation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.akshay.incubation")
public class IncubationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncubationApplication.class, args);
	}

}
