> This project contains level01 by level commits.

From Video 17

| Software     | Version      |
| ------       | ------       |
| Java         |  "1.8.0_161" |
| Apache Maven |  "3.8.5"     |
| Spring Boot  |  "2.7.2"     |

- MovieCatalogService (8081) :
```sh
http://localhost:8081/catalog/1234

[
  {
    "name": "100",
    "desc": "Test Desc",
    "rating": 3
  },
  {
    "name": "200",
    "desc": "Test Desc",
    "rating": 4
  }
]
```
- MovieInfoService (8082) :
```sh
http://localhost:8082/movies/transformer
```
- RatingsDataService (8083) :
```sh
http://localhost:8083/ratingsdata/transformer
```
```
http://localhost:8083/ratingsdata/users/vijay

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

Eureka Server will have it's own UI.
```
http://localhost:8761/
```

> `Branch v04 changes`
- start.spring.io -> Add only one dependency `Eureka Server`

- application.properties of descovery-server (Eureka Server)
```sh
server.port=8761
eureka.client.registerWithEureka=false
eureka.client.fetchRegistry=false
```

```
	<properties>
		<spring-cloud.version>2021.0.3</spring-cloud.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
	</dependencies>    
    
  <dependencyManagement>
	 <dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-dependencies</artifactId>
			<version>${spring-cloud.version}</version>
			<type>pom</type>
			<scope>import</scope>
		</dependency>
	 </dependencies>
	</dependencyManagement>
```


