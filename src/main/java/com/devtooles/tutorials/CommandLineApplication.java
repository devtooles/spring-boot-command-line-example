package com.devtooles.tutorials;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CommandLineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world!");
    }

}
