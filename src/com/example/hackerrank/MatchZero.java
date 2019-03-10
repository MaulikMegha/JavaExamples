package com.example.hackerrank;

public class MatchZero {
    public static void main(String args[]) {
        int n = 6291457;
        String s = Integer.toBinaryString(n);
        /*String[] sArray = s.split("1");
        System.out.println(Arrays.asList(sArray));
        int length = sArray.length;
        int result = 0;
        for(int i = 0; i < length-1; i++){
            if(sArray[i].startsWith("0")){
                int stringSize = sArray[i].length();
                result = result < stringSize ? stringSize : result;
            }
        }*/
       int result = 0;
       for(int i = 0; i < s.length(); i++){
           int count = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                ++count;
                i++;
            }
            if(i >= s.length() ){
                count = 0;
            }
            result = result < count ? count : result;
       }
        System.out.println(result);
    }
}
