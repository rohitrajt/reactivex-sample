package com.rohit.book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by rohitrajt on 2/24/17.
 */
@SpringBootApplication
@ComponentScan(value = "com.rohit.book")
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        logger.info("Book Service is up and running");
    }
}
