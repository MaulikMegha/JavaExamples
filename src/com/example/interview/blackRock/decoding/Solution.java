package com.example.interview.blackRock.decoding;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    /** Copy of original encoding method */
     private static String encode(String text) {
     StringBuilder b = new StringBuilder();
     for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);
         b.append(c += c + i);
     }
     return b.reverse().toString();
     }

    /*
     * Complete the function below.
     */
    private static String decode(String encodedMessage) {
        StringBuilder b = new StringBuilder();
        int length = encodedMessage.length();
        StringBuilder data = new StringBuilder(encodedMessage);
        String input = data.reverse().toString();
        for(int i = 0, j= 0; i < length ; i++, j++){
            char c = input.charAt(i);
            b.append(c -= (c + i)/2);
        }

        return b.toString();
    }

    public static void main(String[] args) throws IOException {
      /*  Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        String encodedMessage;
        try {
            encodedMessage = in.nextLine();
        } catch (Exception e) {
            encodedMessage = null;
        }

        res = decode(encodedMessage);
        bw.write(res);
        bw.newLine();

        bw.close();*/

        System.out.println(encode("Maulik"));
        System.out.println("------------");
        System.out.println(decode(encode("Maulik")));
    }
}