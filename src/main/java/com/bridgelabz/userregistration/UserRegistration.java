package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //UC1 : First name starts with Cap and has minimum 3 characters

    //Method to Validate First name
    public boolean validateFirstName(String fName)
    {
        String regex = "[A-Z][a-z]{2,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fName).matches();
        return check;
    }

    // UC2 :  Last name starts with Cap and has minimum 3 characters

    // Method to validate last name
    public boolean validateLastName(String lName) {
        String regex = "[A-Z][a-z]{2,}";  // Minimum 3 characters in total
        Pattern pattern = Pattern.compile(regex);
        boolean check = pattern.matcher(lName).matches();
        return check;
    }

    // UC3: Validate email (e.g., abc.xyz@bl.co.in)
    public boolean validateEmail(String email) {
        // Regex for email validation as per the given format
        String regex = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(regex);
        boolean check = pattern.matcher(email).matches();
        return check;
    }
    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("Nivrutti"));
        System.out.println(userRegistration.validateLastName("Wagh"));
        System.out.println(userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }
}
