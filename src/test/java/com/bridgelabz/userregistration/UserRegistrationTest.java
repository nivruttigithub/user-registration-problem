package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    // Test case for correct first name
    @Test
    public void FirstNameCorrectTest()
    {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("Nivrutti");
        Assertions.assertTrue(result);
    }

    // Test case for incorrect first name
    @Test
    public void FirstNameIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("nivrutti");
        Assertions.assertFalse(result);
    }

    // Test case for correct last name
    @Test
    public void LastNameCorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("Wagh");
        Assertions.assertTrue(result);
    }

    // Test case for incorrect last name
    @Test
    public void LastNameIncorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("wagh");
        Assertions.assertFalse(result);
    }

    // Test case for correct email
    @Test
    public void EmailCorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    // Test case for incorrect email
    @Test
    public void EmailIncorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateEmail("abc.xyz@bl@co.in");
        Assertions.assertFalse(result);
    }

    // Test case for correct mobile number
    @Test
    public void MobileNumberCorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateMobileNumber("91 9919819801");
        Assertions.assertTrue(result);
    }

    // Test case for incorrect mobile number (missing space)
    @Test
    public void MobileNumberIncorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateMobileNumber("919919819801");  // No space between country code and number
        Assertions.assertFalse(result);
    }

    // Test case for incorrect mobile number (less than 10 digits)
    @Test
    public void MobileNumberShortTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateMobileNumber("91 99198198");  // Less than 10 digits
        Assertions.assertFalse(result);
    }

    // Test case for correct password (minimum 8 characters , atleast 1 UpperCase letter & atleast 1 numeric , atleast 1 Special Character)
    @Test
    public void PasswordCorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Password@123");
        Assertions.assertTrue(result);
    }

    // Test case for incorrect password (less than 8 characters)
    @Test
    public void PasswordIncorrectTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Pass@2");
        Assertions.assertFalse(result);
    }

    // Test case for incorrect password (missing uppercase letter)
    @Test
    public void PasswordMissingUpperCaseTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("password@123");  // No uppercase letter
        Assertions.assertFalse(result);
    }
    // Test case for incorrect password (missing numeric digit)
    @Test
    public void PasswordMissingNumberTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Password@");  // No numeric digit
        Assertions.assertFalse(result);
    }

    // Test case for incorrect password (no special character)
    @Test
    public void PasswordNoSpecialCharTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Password1");  // No special character
        Assertions.assertFalse(result);
    }

    // Test case for incorrect password (more than 1 special character)
    @Test
    public void PasswordTooManySpecialCharsTest() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validatePassword("Password@1!");  // More than 1 special character
        Assertions.assertFalse(result);
    }
}
