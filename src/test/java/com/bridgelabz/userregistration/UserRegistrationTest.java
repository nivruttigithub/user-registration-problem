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
}
