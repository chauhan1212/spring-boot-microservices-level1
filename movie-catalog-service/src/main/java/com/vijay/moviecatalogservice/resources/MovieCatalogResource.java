package com.vijay.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.moviecatalogservice.models.*;

@RestController
@RequestMapping(path = "/catalog")
public class MovieCatalogResource {

	/*
	 * http://localhost:8081/catalog/1234
	 */

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
	}
}
