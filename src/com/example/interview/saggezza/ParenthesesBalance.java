package com.example.interview.saggezza;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesesBalance {

    public static void main(String args[]) {
        String input = "{({[]})}";

        boolean isBalance = isBalance(input);
        System.out.println(input+" -> "+isBalance);
    }

    private static boolean isBalance(String s){
        char[] cArray = s.toCharArray();

        Stack stack = new Stack();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');


        for(int i = 0; i < s.length(); i++){
            if(cArray[i] == '{' || cArray[i] == '(' || cArray[i] == '['){
                stack.push(cArray[i]);
                continue;
            }
            if(cArray[i] == '}' || cArray[i] == ')' || cArray[i] == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop() != map.get(cArray[i])){
                    return false;
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}