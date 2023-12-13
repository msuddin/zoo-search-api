package com.thetestroom.zoosearchapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private PersonRepository dataModelRepository;

    private static final Logger log = LoggerFactory.getLogger(DataController.class);

    @GetMapping("/post-data")
    public List<Person> getData() {
        // Retrieve data from Elasticsearch using the repository
        int page = 0; // specify the page number
        int size = 10; // specify the page size
        Page<Person> pageResult = dataModelRepository.findAll(PageRequest.of(page, size));

        log.info("Received data: {}", pageResult.getContent().getFirst());
        return pageResult.getContent();
    }
}