package com.thetestroom.zoosearchapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
    // additional query methods if needed
    static final Logger log = LoggerFactory.getLogger(PersonRepository.class);
}