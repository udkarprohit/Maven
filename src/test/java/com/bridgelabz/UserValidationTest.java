package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidationTest {
    UserValidation userValidation = new UserValidation();

    @Test
    public void happyCaseValidateUserEntry() {
        User user = new User("Prohit", "Udkar", "prohitudkar2022@gamil.com", "+91 9182999975", "Loveprohit123@");
        boolean result = userValidation.validateUserEntry(user);
        Assertions.assertTrue(result);
        System.out.println("Happy Case Validate User Entry: PASSED");
    }

    @Test
    public void sadCaseValidateFirstName() {
        User user = new User("", "Doe", "johndoe@example.com", "1234567890", "Password123");
        boolean result = userValidation.validateUserEntry(user);
        assertFalse(result);
        System.out.println("Sad Case Validate First Name: FAILED");
    }

    @Test
    public void sadCaseValidateLastName() {
        User user = new User("John", "", "johndoe@example.com", "1234567890", "Password123");
        boolean result = userValidation.validateUserEntry(user);
        assertFalse(result);
        System.out.println("Sad Case Validate Last Name: FAILED");
    }

    @Test
    public void sadCaseValidateEmail() {
        User user = new User("John", "Doe", "johndoeexample.com", "1234567890", "Password123");
        boolean result = userValidation.validateUserEntry(user);
        assertFalse(result);
        System.out.println("Sad Case Validate Email: FAILED");
    }

    @Test
    public void sadCaseValidateMobile() {
        User user = new User("John", "Doe", "johndoe@example.com", "123456789", "Password123");
        boolean result = userValidation.validateUserEntry(user);
        assertFalse(result);
        System.out.println("Sad Case Validate Mobile: FAILED");
    }

    @Test
    public void sadCaseValidatePassword() {
        User user = new User("John", "Doe", "johndoe@example.com", "1234567890", "pass");
        boolean result = userValidation.validateUserEntry(user);
        assertFalse(result);
        System.out.println("Sad Case Validate Password: FAILED");
    }
}

