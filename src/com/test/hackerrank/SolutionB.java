package com.test.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionB {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
    Arrays.sort(arr);
    Arrays.sort(brr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(brr));
    int[] crr = new int[brr.length - arr.length];
    int j = 0;
    int index = 0;
    for(int i = 0; i < arr.length; ) {
       if(arr[i]-brr[j] == 0){
           i++;
           j++;
       } else {
           crr[index] = brr[j];
           j++;
           index++;
       }
    }
    return crr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
       int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
       int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

       /* int[] a = {11, 4, 11, 7, 13, 4, 12, 11, 10, 14};
        int[] b = {11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12};*/
       System.out.println(Arrays.toString(missingNumbers(a, b)));
    }
}

/*

10
        203 204 205 206 207 208 203 204 205 206
        13
        203 204 204 205 206 207 205 208 203 206 205 206 204*/
