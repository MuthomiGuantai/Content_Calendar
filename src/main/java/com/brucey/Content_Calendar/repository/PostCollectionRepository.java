package com.brucey.Content_Calendar.repository;

import com.brucey.Content_Calendar.model.Post;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostCollectionRepository {

    private final List<Post> post = new ArrayList<>();

    public PostCollectionRepository() {

    }
    public List<Post> findAll() {
        return post;
    }

    public Optional<Post> findById(Integer id) {
        return post.stream().filter(p -> p.id().equals(id)).findFirst();
    }
    @PostConstruct
    private void init() {
        Post p = new Post(1,
                "new post",
                "This is my new post",
                "muthomiguantai",
                ""
        );
        post.add(p);
    }
}
