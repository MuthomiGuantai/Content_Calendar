package com.brucey.Content_Calendar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class MyWebConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
