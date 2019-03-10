package com.example.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class TestThree {

	/*static double max(double a, double b)
	{
	    return (a > b) ? a : b;
	 }*/
		
	 static void printknapSack(int W, double wt[], double val[], int n)
	 {
	     double K[][] = new double[n + 1][W + 1];
	
	     for (int i = 0; i <= n; i++) {
	         for (int j = 0; j <= W; j++) {
	             if (i == 0 || j == 0)
	                 K[i][j] = 0;
	             else if (wt[i - 1] <= j)
	                 K[i][j] = Math.max(val[i - 1] +
							 K[i-1][(int) Math.round(j-wt[i-1])], K[i - 1][j]);
	             else
	                 K[i][j] = K[i - 1][j];
	         }
	     }
		 /*int i, w;
		 double K[][] = new double[n+1][W+1];

		 // Build table K[][] in bottom up manner
		 for (i = 0; i <= n; i++)
		 {
			 for (w = 0; w <= W; w++)
			 {
				 if (i==0 || w==0)
					 K[i][w] = 0;
				 else if (wt[i-1] <= w)
					 K[i][w] = Math.max(val[i-1] + K[i-1][(int) Math.round(w-wt[i-1])],  K[i-1][w]);
				 else
					 K[i][w] = K[i-1][w];
			 }
		 }*/

		 double res =  K[n][W];
	     // stores the result of Knapsack
	     //double res = K[n][W];
	     System.out.println(res);
	     
	     ArrayList<Integer> resultIndex = new ArrayList<>();
	     int w = W;
	     for (int k = n; k > 0 && res > 0; k--) {
	         if (res == K[k - 1][w])
	             continue;
	         else {
	        	 resultIndex.add(k);
	             res = res - val[k - 1];
	             w = (int) Math.round(w - wt[k - 1]);
	         }
	     }
	     Collections.reverse(resultIndex);
	     IntStream.range(0, resultIndex.size())
	     .mapToObj(index -> resultIndex.get(index) + (index < resultIndex.size()-1 ? "," : ""))
	     .forEach(System.out::print);
	 }

 	//Driver code
	public static void main(String arg[])
	{
	  //String input = "81 : (1,53.38,$45) (2,88.63,$98) (3, 78.48, $3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)";
		String input = "75 : (1,85.31,$29) (2,14.55,$74) (3, 3.98,$16) (4,26.24,$55) (5,63.69,$52) (6,76.25,$75) (7,60.02,$74) (8,93.18,$35) (9,89.95,$78)";
	   String[] inputs = input.split(":");
	   int W = Integer.parseInt(inputs[0].trim());
	   String[] data = inputs[1].split("\\)");
	   int length = data.length;
	   double[] val = new double[length];
	   double[] wt = new double[length];
	   
	   for(int i = 0; i < length; i++ ) {
		   String[] s = data[i].split(",");
		   wt[i] = Double.parseDouble(s[1].trim());
		   // System.out.println(s[2].substring(1).trim());
		   val[i] = Double.parseDouble(s[2].trim().substring(1));
	   }
	   
	   //double val[] = new double[]{85.31,14.55,3.98,26.24,63.69,76.25,60.02,93.18,89.95};
	   //int wt[] = new int[]{29,74,16,55,52,75,74,35,78};
	   
	   //double val[] = { 60, 100, 120, 60, 250 };
	   //int wt[] = { 10, 20, 25, 5, 50 };
	   //int W = 50;
	   //int n = val.length;
	
	   printknapSack(W, wt, val, length);
	}
}
