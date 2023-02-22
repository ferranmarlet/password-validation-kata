package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class PasswordValidatorTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldReturnZeroWhenNoPinsKnockedOut() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertFalse(passwordValidator.isValid("password"));
    }
}
