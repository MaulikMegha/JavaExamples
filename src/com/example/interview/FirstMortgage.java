package com.example.interview;

public class FirstMortgage {

    public static void main(String args[]) {

        double principal = 920000;
        //float apr = 3.0f;
        float apr = 3.125f;
        float r = (apr/100)/ 12;
        int year = 30;
        int n = year * 12;
        double base  = (1 + r);

        double x = Math.pow(base, n);

        double mortgage = Math.round(principal * ( (r * x) / (x - 1)));
        System.out.println("first mortgage : "+mortgage);

        double totalPay = 0;
        for (int i = 1; i <= n; i++) {
            totalPay += mortgage;
        }

        double totalInterest  = totalPay - principal;
        System.out.println("Total Interest : "+totalInterest);

        /*MONTH	 MORTGAGE	PRINCIPAL	INTEREST	PRINCIPAL-REMAINING*/
        System.out.println("MONTH \t\t MORTGAGE \t PRINCIPAL \t INTEREST \t PRINCIPAL-REMAINING \t");
        double remainingPrincipal = principal;

        for(int i = 1 ; i <= n ; i++) {
            double monthlyInterast = Math.round(getInterast(remainingPrincipal, apr));
            double monthlyPrincipal = mortgage - monthlyInterast;
            remainingPrincipal = remainingPrincipal - monthlyPrincipal;

            System.out.println(i+" \t\t\t"+ mortgage +" \t\t"+ monthlyPrincipal +" \t\t"+ monthlyInterast +" \t\t"+ remainingPrincipal +" \t");

        }

        /*System.out.println("Total Interast : "+totalInterast(principal, year));*/

    }

    private static double getInterast(double amount, double apr){
        double inter = (amount * apr)/100;
        return inter/12;
    }

    private static double totalInterast(double principal, int year) {
        double totalInterast = principal * 0.03 * year;
        return totalInterast;
    }
}
