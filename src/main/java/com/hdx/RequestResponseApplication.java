package com.hdx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RequestResponseApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { RequestResponseApplication.class }, args);
	}
}