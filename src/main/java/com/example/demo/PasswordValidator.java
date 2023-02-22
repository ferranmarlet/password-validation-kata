package com.example.demo;

import org.springframework.boot.SpringApplication;

public class PasswordValidator {

    public static void main(String[] args) {
        SpringApplication.run(PasswordValidator.class, args);
    }

    public boolean isValid(String password) {
        return true;
    }
}
