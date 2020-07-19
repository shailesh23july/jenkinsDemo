package com.allianz.sh.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		System.out.println("Configuration file");
		SpringApplication.run(RestApiApplication.class, args);
	}

}
