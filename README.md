# Zoo Search API

## Description

This project is divided into 4 parts:
- [Zoo Data API](https://github.com/msuddin/zoo-data-api) (Java Rest API) -> Talks to Zoo Elastic Search
- [Zoo Elastic Search](https://github.com/msuddin/zoo-elastic-search) (dockerized Elasticsearch instance)
- [Zoo Search API](https://github.com/msuddin/zoo-search-api) (Java Rest API) -> Pulls from Zoo Elastic Search
- [Zoo UI](https://github.com/msuddin/zoo-ui) (React APP) -> Pulls data from Zoo Search API

Zoo Search API is a Java Rest API that pulls data from Zoo Elastic Search (a dockerized Elasticsearch instance).
It also has Rest Controller Endpoints to allow the Zoo UI to pull the data.
Basically it is a service layer between Zoo Elastic Search (Elasticsearch instance) and Zoo UI (React APP).

## Instructions

To run the API (from command line):

```
mvn spring-boot:run
```

To run tests (from command line):

```
mvn clean install
```

## Learning Outcomes

Here are the learning outcomes of this project.

- [x] To build a Java Rest API that can talk to Zoo Elastic Search and pull the data
- [ ] To write tests using JUnit
- [ ] More to follow