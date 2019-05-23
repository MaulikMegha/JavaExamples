package com.example.interview.blackRock.currencyConverter;

import java.util.Arrays;

public class MainApp {
    /*
         *
         * convert USD=EUR
         * EUR=GBP
         * GBP=USD
         */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] s= {"0.5795 0.5173 1.2223","0.7931 0.5663 1.0012","1.2767 1.1696 0.001"};
        int[] val=catculateProfit(s);
        System.out.println(Arrays.toString(val));
    }

    static int [] catculateProfit(String[] str) {
        //double  num=100000;
        int i=0;
        int []resultval=new int[str.length];
        for(String s:str) {
            double  num=100000;

            String[] splitStr=s.split(" ");
            //double[] intArr=Stream.of(splitStr).mapToDouble(Double::parseDouble).toArray();
            for(String st:splitStr) {
                num=num/Float.parseFloat(st);
                System.out.println("num : "+num);
            }
            // System.out.println((num-100000));
            int calNum=(int)(num-100000);
            System.out.println("calNum : "+calNum);
            resultval[i++]=calNum>0?calNum:0;

            // System.out.println(Arrays.toString(intArr)+"  "+Arrays.toString(resultval1));
            //resultval=Arrays.stream(resultval1).mapToInt(n->(int)Math.round(n)).toArray();
        }
        return resultval;
    }
}
