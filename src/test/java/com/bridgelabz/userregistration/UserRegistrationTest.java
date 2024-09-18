package com.bridgelabz.userregistration;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void FirstNameCorrectTest()
    {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("John");
        Assertions.assertTrue(result);
    }
    @Test
    public void FirstNameIncorrectTest() {
        UserRegistration user=new UserRegistration();
        boolean result=user.validateFirstName("john");
        Assertions.assertFalse(result);
    }
}
