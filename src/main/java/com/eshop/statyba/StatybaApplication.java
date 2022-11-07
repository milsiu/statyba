package com.eshop.statyba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatybaApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatybaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StatybaApplication.class, args);
        LOGGER.info("Starting statyba.net application logs");
    }
}
