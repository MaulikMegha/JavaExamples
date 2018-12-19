package com.test.hackerrank;

import java.util.Scanner;

public class SolutionC {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int sLength = s.length();
        long smallest = -1;
        boolean isSequence = false;
        for (int i=1; i<= sLength/2; ++i) {
            long x = Long.parseLong(s.substring(0,i));
            smallest = x;
            String sSequence = Long.toString(x);
            while (sSequence.length() < s.length()) {
                sSequence += Long.toString(++x);
            }

            if (sSequence.equals(s)) {
                isSequence = true;
                break;
            }
        }
        System.out.println(isSequence ? "YES " + smallest : "NO");
       /* int index = 1;
        if(sLength > 1){
            for(int i = 0; i < sLength-1; ){ // 1 2 3 4
                int x = Integer.parseInt(s.substring(i,i+index));
                int y = Integer.parseInt(s.substring(i+1,i+1+index));
                if(x+1 == y) {
                    i++;
                } else {
                    index += 1;
                }
                if(i >= sLength-1) {
                    System.out.println("YES");
                }
            }
        } else {
            System.out.println("NO");
        }*/
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
