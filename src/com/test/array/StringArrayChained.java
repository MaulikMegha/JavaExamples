package com.test.array;

import java.util.*;

public class StringArrayChained {

    public static void main(String args[]){
        String[] input = {"aaa", "bbb", "baa", "aab"}; // {"ijk", "kji", "abc", "cba"};
        int length = input.length;
        List<Integer> weekList = new ArrayList<>();
        Set<Integer> weekSet = new HashSet<>();
        weekSet.add(0);

        String s = input[0];
        int count = 1;
        while(count < length && weekSet.size() != length){
            for(int i = 1; i < length; i++){
                if(s.charAt(s.length()-1) == input[i].charAt(0) && !weekList.contains(i)){
                    s += input[i];
                    weekList.add(i);
                    count++;
                    break;
                } else {
                    weekSet.add(i);
                }
            }
        }



        System.out.println(s.charAt(0) == s.charAt(s.length()-1) && count == length ? "YES" : "NO");
    }
}