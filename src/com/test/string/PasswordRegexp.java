package com.test.string;

/*
The password policy is:
        At least 8 chars
        Contains at least one digit
        Contains at least one lower alpha char and one upper alpha char
        Contains at least one char within a set of special chars (@#%$^ etc.)
        Does not contain space, tab, etc.
*/
public class PasswordRegexp {
    public static void main(String args[]) {
        String password = "#Password8";

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        /*
          Explanation for strong password policy
            ^                 # start-of-string
            (?=.*[0-9])       # a digit must occur at least once
            (?=.*[a-z])       # a lower case letter must occur at least once
            (?=.*[A-Z])       # an upper case letter must occur at least once
            (?=.*[@#$%^&+=])  # a special character must occur at least once
            (?=\S+$)          # no whitespace allowed in the entire string
            .{8,}             # anything, at least eight places though
            $                 # end-of-string
        */

        System.out.println(password.matches(pattern));

    }
}