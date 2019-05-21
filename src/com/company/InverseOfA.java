package com.company;
import java.util.Scanner;
public class InverseOfA {
    static  int deter;

    void InverseOfA() {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number(must be a square matrix) of the rows and column (upto 3*3) :");

        int m = in.nextInt();
        int n = in.nextInt();
        if ((m > 0 && n > 0) && (m < 4 && n < 4)) {
            int[][] first = new int[m][n];

            System.out.println("enter the elements of the  matrix");

            for (int c = 0; c < m; c++)
                for (int d = 0; d < n; d++)
                    first[c][d] = in.nextInt();

            if (m < 2 && n < 2) {
                System.out.println("determinant is :" + first[0][0]);

            } else if ((m < 3 && n < 3) && (m > 1 && n > 1)) {
                int c = 0, d = 0;
                 deter = first[c][d] * first[c + 1][d + 1] - first[c + 1][d] * first[c][d + 1];
                System.out.println("determinant is: " + deter);
            } else if (m > 2 && n > 2) {

                int c = 0, d = 0;
                int x = first[c][d] * ((first[c + 1][d + 1] * first[c + 2][d + 2]) - (first[c + 2][d + 1] * first[c + 1][d + 2]));
                int y = first[c][d + 1] * ((first[c + 1][d] * first[c + 2][d + 2]) - (first[c + 2][d] * first[c + 1][d + 2]));
                int z = first[c][d + 2] * ((first[c + 1][d] * first[c + 2][d + 1]) - (first[c + 2][d] * first[c + 1][d + 1]));
                 deter = x - y + z;
                System.out.println("determinant is :" + deter);
            }
        }
        System.out.println(deter);
    }
}