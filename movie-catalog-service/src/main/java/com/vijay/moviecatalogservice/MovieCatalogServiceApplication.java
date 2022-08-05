package com.vijay.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//server.port=8081
@SpringBootApplication
public class MovieCatalogServiceApplication {

	//API: http://localhost:8081/catalog/123
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
