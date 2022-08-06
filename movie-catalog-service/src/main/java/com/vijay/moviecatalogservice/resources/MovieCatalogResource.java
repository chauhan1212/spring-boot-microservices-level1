package com.vijay.moviecatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vijay.moviecatalogservice.models.CatalogItem;
import com.vijay.moviecatalogservice.models.Movie;
import com.vijay.moviecatalogservice.models.Rating;
import com.vijay.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping(path = "/catalog")
public class MovieCatalogResource {

	/*
	 * http://localhost:8081/catalog/1234
	 */
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

//		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));
		
		UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + userId, UserRating.class);

		List<CatalogItem> catalogs = ratings.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getMovieId(), movie.getDescription(), rating.getRating());
		}).collect(Collectors.toList());

		return catalogs;
	}
}
