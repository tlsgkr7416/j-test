package com.example.haha;

import com.example.haha.mama.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HahaApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HahaApplication.class);
	}
	public static void main(String[] args) {

		System.out.println("ffddd");
		SpringApplication.run(HahaApplication.class, args);

		List<Integer> az = new ArrayList<>();
		az.add(5);



	}

}
