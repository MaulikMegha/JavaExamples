package com.example.interview.CR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String args[]) {

        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("Total Record", 0);
        resultMap.put("Valid Record", 0);
        resultMap.put("InValid Record", 0);
        resultMap.put("Error Line", 0);

        List<String> inputData = new ArrayList<>();
        inputData.add("1|John|Smith|john@yahoo.com");
        inputData.add("2|Jane|Doe|jdoe@gmail.com");
        inputData.add("3|Paul|Sun|psun@hotmail.fooo");
        inputData.add("4||Ting|");
        inputData.add("5|Dennis||dennis.ting@consumer.org");
        inputData.add("6|D|T||dt@outlook.com");
        inputData.add("8|Paula|Stein|paula@stein@gmail.com");
        inputData.add("9|Chris|Copper|chris.copper@hotmail.com");
        inputData.add("10|Daniel|Yu|dan.yu@ymail.net");

       /*Email must be of form user@domain where domain in (gmail.com, yahoo.com, hotmail.com, outlook.com, consumer.org, ymail.net)

        c) write to stdout the total number of records in the file
        d) write to stdout the total number of records that pass validation
        e) write to stdout the total number of records that failed validation
        f) write to stdout which records line that had errors
        */

        /*
        1|John|Smith|john@yahoo.com
        2|Jane|Doe|jdoe@gmail.com
        3|Paul|Sun|psun@hotmail.fooo
        4||Ting|
        5|Dennis||dennis.ting@consumer.org
        6|D|T||dt@outlook.com
        7|Henry|Hill|Henry.hill@gmail.com
        8|Paula|Stein|paula@stein@gmail.com
        9|Chris|Copper|chris.copper@hotmail.com
        10|Daniel|Yu|dan.yu@ymail.net
        */

        String idPattern = "^[0-9]+$";
        String fNamePattern = "^[a-zA-Z ]+$";
        String lNamePattern = "^[a-zA-Z ]+$";
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        for (String inputString :inputData) {
            String[] requestSet = inputString.split("|");
            resultMap.put("Total Record", inputData.size());

            if(requestSet.length == 4) {
                if(requestSet[0].matches(idPattern) && requestSet[1].matches(fNamePattern)
                        && requestSet[2].matches(lNamePattern) && requestSet[3].matches(emailPattern)){
                    int count = resultMap.get("Valid Record");
                    resultMap.put("Valid Record", count++);
                } else {
                    int count = resultMap.get("InValid Record");
                    resultMap.put("InValid Record", count++);
                }
            } else {
                int count = resultMap.get("Error Line");
                resultMap.put("Error Line", count++);
            }
        }

        System.out.println("result data: " + resultMap.toString());

        /* ID must be numeric */
        /*String id = "1";
        String idPattern = "^[0-9]+$";
        System.out.println(id + " - " + id.matches(idPattern));*/

        /*
        First name must contain 2 or more alphabet characters or space (single space preferred)

        Ex.1 - John --> valid
        Ex.2 - Mary Jane --> valid
        Ex.3 - Foo123 --> not valid
        Ex.4 - Dr. Oz --> not valid (for the purpose of this exercise)
        */

        /*String firstName = "Mary Jane";
        String fNamePattern = "^[a-zA-Z ]+$";
        System.out.println(firstName + " - " + firstName.matches(fNamePattern));*/

       /* Last name must contain at least 2 or more alphabet characters or space (single space preferred but optional)

        Ex.1 - Smith --> valid
        Ex.2 - Van Brocklin --> valid
        Ex.3 - Bar One123 --> not valid
        Ex.4 - Paul III --> valid
        Ex.5 - Brown Jr --> valid
        Ex.6 - Brown, Jr. --> not valid (for purpose of exercise)
        */

        /*String lastName = "Bar One123";
        String lNamePattern = "^[a-zA-Z ]+$";
        System.out.println(lastName + " - " + lastName.matches(lNamePattern));*/


        /* email validation
        Ex.1 - john@yahoo.com --> valid
        Ex.2 - jdoe@gmail.com --> valid
        Ex.3 - psunhotmail.fooo --> not valid
        Ex.4 - dennis.ting@consumer.org --> valid
        Ex.5 - dt@outlook.com --> valid
        Ex.6 - Henry.hill@gmail.com --> valid
        Ex.7 - paula@stein@gmail.com --> not valid
        */

        /*String email = "psunhotmail.fo.oo";
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        System.out.println(email + " - " + email.matches(emailPattern));*/

    }
}
