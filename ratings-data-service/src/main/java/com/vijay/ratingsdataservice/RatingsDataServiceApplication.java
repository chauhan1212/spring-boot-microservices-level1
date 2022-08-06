package com.vijay.ratingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// server.port=8083
@SpringBootApplication
public class RatingsDataServiceApplication {

	// API: http://localhost:8083/ratingsdata/transformer
	// API: http://localhost:8083/ratingsdata/users/vijay
	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

}
