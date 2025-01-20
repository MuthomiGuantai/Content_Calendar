package com.brucey.Content_Calendar.controller;

import com.brucey.Content_Calendar.model.User;
import com.brucey.Content_Calendar.repository.UserCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserCollectionRepository repository;

    public UserController(UserCollectionRepository repository) {
        this.repository = repository;
    }

    //Get a list of all users

    @GetMapping("")
    public List<User> findAll() {
        return repository.findAll();
    }
}
