package com.test.string;

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
    }
}