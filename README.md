
> This project contains level by level commits.
> Main commits contains videos from 1 to 10.
> - This commit has 3 microservices with 3 Basic API Details.

- MovieCatalogService (8081) :

```sh
http://localhost:8081/catalog/1234
```

```
Output:
[
  {
    "name": "Transformers",
    "desc": "Test",
    "rating": 4
  }
]
```

- MovieInfoService (8082) :
```sh
http://localhost:8082/movies/transformer
```

```
Output:
{
  "movieId": "transformer",
  "name": "Test Name",
  "description": "Test Desc"
}
```

- RatingsDataService (8083) :
```sh
http://localhost:8083/ratingsdata/transformer
```

```
Output:
{
  "movieId": "transformer",
  "rating": 4
}
```


| Software     | Version      |
| ------       | ------       |
| Java         |  "1.8.0_161" |
| Apache Maven |  "3.8.5"     |
| Spring Boot  |  "2.7.2"     |
