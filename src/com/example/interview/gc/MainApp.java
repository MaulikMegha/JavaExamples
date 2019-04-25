package com.example.interview.gc;

public class MainApp {
    public static void main(String args[]){
        // input
        String s1 = "aabbbaaa";
        // output
        // String s2 = "a2b3a3";
        int length = s1.length();
        for(int i = 0 ; i < length; ){
            int count = 0;
            char currentChar = s1.charAt(i);
            for(int j = i; j < length; j++){
                char nextChar = s1.charAt(j);
                i = j;
                if(currentChar == nextChar){
                    count++;
                } else {
                    System.out.print(currentChar+"" +count);
                    break;
                }
            }
            if(i == length-1){
                if(currentChar != s1.charAt(i)){
                    System.out.print(s1.charAt(i)+"1");
                } else {
                    System.out.print(currentChar+"" +count);
                }
                break;
            }

        }
    }
}