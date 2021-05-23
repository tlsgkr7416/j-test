package com.example.haha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HahaApplication {

	public static void main(String[] args) {
		System.out.println("fff");
		SpringApplication.run(HahaApplication.class, args);
	}

}
