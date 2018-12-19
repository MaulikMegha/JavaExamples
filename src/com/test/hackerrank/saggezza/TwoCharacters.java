package com.test.hackerrank.saggezza;

import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {
    public static void main(String args[]){
        String s = "beabeefeab";

        int result  = twoCharacters(s);

        System.out.println("Result = "+result);
    }

    static int twoCharacters(String s){
        Set<Character> char_set = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char_set.add(s.charAt(i));
        }

        Character[] char_arr = char_set.toArray(new Character[char_set.size()]);
        int max = 0;

        for (int j = 0; j < char_arr.length - 1; j++) {
            for (int k = j + 1; k < char_arr.length; k++) {
                String pattern = "([^" + char_arr[j] + char_arr[k] + "])";
                String trimmedStr = s.replaceAll(pattern, "");
                if (isTwoCharacter(trimmedStr) && trimmedStr.length() > max) {
                    max = trimmedStr.length();
                }
            }
        }
        return max;
    }

    static boolean isTwoCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }
}