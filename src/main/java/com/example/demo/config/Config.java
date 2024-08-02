package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class Config {

    @Bean
    public String message() {
    	log.info("Bean message ++++++++++");
        return "World!";
    }
}
