package com.bridgelabz;

public class UserValidation {

    public boolean validateUserEntry(User user) {
        String firstName = "^[A-Z][a-z]{2,}$";
        if (!user.getFirstName().matches(firstName)) {
            return false;
        }
        String lastName = "^[A-Z][a-z]{2,}$";
        if (!user.getLastName().matches(lastName)) {
            return false;
        }
        String emailRegex = "^[a-z]{3,}[-_+.a-z0-9]*[@][0-1a-z]+[.][a-z]{2,}[.]?[,a-z]{0,3}$";
        if (!user.getEmail().matches(emailRegex)) {
            return false;
        }
        String phoneNumber = "^[+](91)[\\s][0-9]{10}$";
        if (user.getMobile().matches(phoneNumber)) {
            return false;
        }

        String userPassword = "^[A-Z][a-z]{7,}[0-9]+[@#$%&]$";
        if (!user.getPassword().matches(userPassword)) {
            return false;
        }

        return true;
    }
}

