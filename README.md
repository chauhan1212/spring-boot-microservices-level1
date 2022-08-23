> v03  commits contains videos from 14 to 16.

From Video 14 to 16.

| Software     | Version      |
| ------       | ------       |
| Java         |  "1.8.0_161" |
| Apache Maven |  "3.8.5"     |
| Spring Boot  |  "2.7.2"     |

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
```
http://localhost:8083/ratingsdata/users/vijay
```
```
{
  "userId": "vijay",
  "ratings": [
    {
      "movieId": "100",
      "rating": 3
    },
    {
      "movieId": "200",
      "rating": 4
    }
  ]
}
```

