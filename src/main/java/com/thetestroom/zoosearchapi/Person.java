package com.thetestroom.zoosearchapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "zoo-main")
public class Person {

    private static final Logger log = LoggerFactory.getLogger(Person.class);

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    public Person() {
        // Required default constructor
    }

    public Person(String name) {
        this.name = name;
        log.info("Person created with name: {}", this.name);
    }

    public String getName() {
        log.info("Getting name: {}", name);
        return name;
    }

    public void setName(String name) {
        log.info("Setting name: {}", name);
        this.name = name;
    }
}
