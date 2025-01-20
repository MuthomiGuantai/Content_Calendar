package com.brucey.Content_Calendar.controller;

import com.brucey.Content_Calendar.model.Content;
import com.brucey.Content_Calendar.model.Post;
import com.brucey.Content_Calendar.repository.ContentCollectionRepository;
import com.brucey.Content_Calendar.repository.PostCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final PostCollectionRepository repository;


    public PostController(PostCollectionRepository repository) {
        this.repository = repository;
    }

    //make a request to find all the pieces of content in the system
    @GetMapping("")
    public List<Post> findAll() {
        return repository.findAll();
    }
}
