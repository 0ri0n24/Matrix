package com.company;
import java.util.Scanner;
public class scalarMultiplication {
    void scalar() {
        Scanner in = new Scanner(System.in);
        int m, n,coeff;
        System.out.println("enter the scalar :");
        coeff = in.nextInt();
        System.out.println("enter the number of rows and column of the matrix");
        m = in.nextInt();
        n= in.nextInt();
        System.out.println("enter the elements in the matrix :");
        int[][] scalar = new int[m][n];
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                scalar[c][d]=coeff * in.nextInt();
            }
        }
        System.out.println("after scalar multiplication the output id :");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.print(scalar[c][d] + "\t");
            }
            System.out.println();
        }



    }
}