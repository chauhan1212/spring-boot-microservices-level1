package com.vijay.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//server.port=8082
@SpringBootApplication
public class MovieInfoServiceApplication {

	// http://localhost:8082/movies/transformer
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
