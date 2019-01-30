package com.test.hackerrank;

import java.util.Scanner;

public class SeparateNumber {

    // separateNumbers function below.
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
