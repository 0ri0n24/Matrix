package com.company;
import java.util.Scanner;
public class transpose {
    void transpose(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and column of the matrix:");
        int m=in.nextInt(),  n=in.nextInt();

        int [][]transpose = new int[m][n];

        System.out.println("enter the elements in the matrix");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
               transpose [c][d]= in.nextInt();
            }
        }
        System.out.println("entered matrix ");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.print(transpose[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println("output matrix");
        for(int c=0;c<n;c++){
            for(int d=0;d<m;d++){
                System.out.print(transpose[d][c]+"\t");
            }
            System.out.println();
        }

    }
}
