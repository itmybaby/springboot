package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Study8Application {

	public static void main(String[] args) {
		SpringApplication.run(Study8Application.class, args);
	}
}
