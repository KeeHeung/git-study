package com.example.gitstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitstudyApplication {

    public static void main(String[] args) {
        System.out.println("new line");
        System.out.println("modified");
        System.out.println("a");
        System.out.println("b");
        System.out.println("d");
        SpringApplication.run(GitstudyApplication.class, args);
    }

}