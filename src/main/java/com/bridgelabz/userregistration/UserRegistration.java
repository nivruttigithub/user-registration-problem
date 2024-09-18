package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String fName)
    {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern=Pattern.compile(regex);
        boolean check=pattern.matcher(fName).matches();
        return check;
    }
    public static void main(String[] args) {
        UserRegistration userRegistration=new UserRegistration();
        System.out.println(userRegistration.validateFirstName("john"));
    }
}
