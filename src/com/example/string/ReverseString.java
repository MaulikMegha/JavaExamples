package com.example.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;

public class ReverseString {
    public static void main(String args[]) {

        String input = "Maulik Megha";
        // output will be: ahgeM kiluaM

        // we can reverse string using inbuilt function;
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println("using inbuilt fun : "+stringBuilder.reverse().toString());

        // let's implement using simple logic
        int sLength = input.length();
        System.out.print("using for loop : ");
        for (int i = sLength - 1 ; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println("");

        // using java 8
        String reversed = input.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
        System.out.println("using java 8 : "+reversed);

        List<String> flist = Arrays.asList("DONATION");
        System.out.println("**Is-Bundle : "+flist.containsAll(Arrays.asList("CRO", "CNS")) );

        System.out.println("**1 : "+flist.contains("CRO"));
        System.out.println("**2 : "+flist.contains("CNS"));
        System.out.println("**3 : "+flist.contains("DONATION"));

        System.out.println("local date +1  : "+ LocalDate.now().plusDays(1));
        System.out.println("local date now : "+ LocalDate.now());

        /*List<String> newsletters = Arrays.asList("Cars", "food");
        String newsletter = "cars";
        System.out.println(" -> "+newsletters.contains(newsletter.toLowerCase()));*/

        /*Map<Integer, String> ACTION_MAP = new HashMap<>();
        ACTION_MAP.put(200, "ACTION_CUSTOMER_CREATED");
        ACTION_MAP.put(400, "NO_ACTION_EMAIL_NOT_VALID");
        ACTION_MAP.put(409, "NO_ACTION_EMAIL_EXISTS_IN_ECQ");

        System.out.println("map value for 200 : "+ACTION_MAP.get(200));
        System.out.println("map value for 500 : "+ACTION_MAP.get(500));

        if (ACTION_MAP.get(500) == null ){
            System.out.println("null ....");
        }*/
        String countryCode = "CI";
        String countryName = "Côte d'Ivoire";

        Hashtable<Object, Object> ht = new Hashtable<>();
        ht.put(countryCode, countryName);

        System.out.println("CI country Name = "+countryName+" << map >> "+ht);

        String correctValue = "Côte d'Ivoire";
        String wrongValue = "CÃ´te d'Ivoire";

        try {
            System.out.println("displayValue-1 = "+new String(wrongValue.getBytes("ISO-8859-1"), "UTF-8"));
            System.out.println("displayValue-2 = "+new String(wrongValue.getBytes("UTF-8"), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /*System.out.println("displayValue2 = "+(StandardCharsets.UTF_8
                        .encode(wrongValue)).toString());*/

    }
}