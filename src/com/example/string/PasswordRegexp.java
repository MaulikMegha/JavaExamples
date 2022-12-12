package com.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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





        // 2. numeric only regex
        /* ID must be numeric */
        String s = "1";
        String idPattern = "^[0-9]+$";
        System.out.println(s + " - " + s.matches(idPattern));




        /*
        First name must contain 2 or more alphabet characters or space (single space preferred)

        Ex.1 - John --> valid
        Ex.2 - Mary Jane --> valid
        Ex.3 - Foo123 --> not valid
        Ex.4 - Dr. Oz --> not valid (for the purpose of this exercise)
        */
        String s1 = "Dr. Oz";
        String fNamePattern = "^[a-zA-Z ]+$";
        System.out.println(s1 + " - " + s1.matches(fNamePattern));



       /* Last name must contain at least 2 or more alphabet characters or space (single space preferred but optional)
        Ex.1 - Smith --> valid
        Ex.2 - Van Brocklin --> valid
        Ex.3 - Bar One123 --> not valid
        Ex.4 - Paul III --> valid
        Ex.5 - Brown Jr --> valid
        Ex.6 - Brown, Jr. --> not valid (for purpose of exercise)
        */
        String s2 = "Brown, Jr.";
        String lNamePattern = "^[a-zA-Z ]+$";
        System.out.println(s2 + " - " + s2.matches(lNamePattern));




        // email validation
        /*String email = "jenmanz@aol.com";
        List<String> patternList = Arrays
                .asList("^[\\w\\.\\-\\\\+]{1,}\\@nowhere\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@nobody\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@noemails\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@noemail\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@nowhere\\.net",
                        "^[\\w\\.\\-\\\\+]{1,}\\@none\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@example\\.com$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@example\\.net$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@example\\.org$",
                        "^[\\w\\.\\-\\\\+]{1,}\\@example\\.edu$",
                        "^jenmanz\\@aol\\.com$",
                        "^noemail\\@yahoo\\.com$",
                        "^some\\@yahoo\\.com$",
                        "^nowhere\\@anywhere\\.com$",
                        "^bogus\\@yahoo\\.com$");
        boolean isBlacklistEmail = false;
        for(String pattern : patternList) {
            isBlacklistEmail = email.matches(pattern);
            if(isBlacklistEmail)
                break;
        }
        System.out.println(email + " >> isBlackList: " +isBlacklistEmail);*/


        /*String email = "customer.usergmail.com";
        String emailPattern = "^(.+)@(.+)$";

        if(email.isEmpty() || !email.matches(emailPattern)){
            System.out.println(email + " - " + email.matches(emailPattern));
            System.out.println(email + " IsEmpty - " + email.isEmpty());
        }*/

        System.out.println("-***********************-");
        List<String> emails = new ArrayList();
        //Valid emails
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in.us.or.v");
        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");
        emails.add("user@yahoo");
        emails.add("user@domaincom");
        emails.add(".com");

        String regex = "^(.+)@(.+)$";

        for(String email : emails) {
            System.out.println(email +" : "+email.matches(regex));
        }


    }
}