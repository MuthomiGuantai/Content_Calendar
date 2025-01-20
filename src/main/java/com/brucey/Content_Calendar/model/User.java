package com.brucey.Content_Calendar.model;

import java.time.LocalDateTime;

public record User (
        Integer id,
        String username,
        String email,
        String password,
        String url,
        LocalDateTime dateCreated
){

}
