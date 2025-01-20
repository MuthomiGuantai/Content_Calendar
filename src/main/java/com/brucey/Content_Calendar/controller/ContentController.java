package com.brucey.Content_Calendar.controller;

import com.brucey.Content_Calendar.model.Content;
import com.brucey.Content_Calendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;


    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    //make a request to find all the pieces of content in the system
    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }
}
