package com.brucey.Content_Calendar.repository;

import com.brucey.Content_Calendar.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserCollectionRepository {

    private final List<User> user = new ArrayList<>();

    public UserCollectionRepository() {

    }

    public List<User> findAll() {
        return user;
    }

    public Optional<User> findById(Integer id) {
        return user.stream().filter(u -> u.id().equals(id)).findFirst();
    }
    @PostConstruct
    public void init() {
        User u = new User(1,
                "muthomiguantai",
                   "muthomiguantai@gmail.com",
                "Clearme@18",
                "",
                null);

        user.add(u);
    }
}
