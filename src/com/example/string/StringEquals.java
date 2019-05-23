package com.example.string;

public class StringEquals {

    public static void main(String args[]){
        String s1 = "Maulik";
        String s2 = "Maulik";
        System.out.println("s1 == s2 : "+(s1 == s2));

        String s3 = new String(s1);
        System.out.println("s1 == s3 : "+(s1 == s3));

        String s4 = s2;
        System.out.println("s1 == s4 : "+(s1 == s4));

        String s5 = s3;
        System.out.println("s1 == s5 : "+(s1 == s5));
        System.out.println("s5 == s3 : "+(s5 == s3));

       String s6 = s2.toUpperCase();
        System.out.println("s1 : "+s1);
        System.out.println("s6 : "+s6);
        System.out.println("s1 == s2 : "+(s1 == s2));


        String str = new String("Maulik");
        System.out.println("**s1 : "+s1);
        System.out.println("**str : "+str);
        System.out.println("s1 == str : "+(s1 == str));


        // below comparison base on equals method
        System.out.println("===============================");
        System.out.println("s1 equals s2 : "+(s1.equals(s2)));
        System.out.println("s1 equals s3 : "+(s1.equals(s3)));
        System.out.println("s1 equals s4 : "+(s1.equals(s4)));
        System.out.println("s1 equals s5 : "+(s1.equals(s5)));
        System.out.println("s5 equals s3 : "+(s5.equals(s3)));
    }
}