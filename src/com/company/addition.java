package com.company;
import java.util.Scanner;
public class addition {
    void add(){
        Scanner in = new Scanner(System.in);

        int m,n;
        System.out.println("enter the number of rows and column of matrix");
        m =in.nextInt();
        n=in.nextInt();
        int [][] first = new int[m][n];
        int [][] second = new int[m][n];
        int [][]sum = new int[m][n];

        System.out.println("enter the elements of first matrix");
        for(int c = 0;c<m;c++){
            for(int d=0;d<n;d++){
                first[c][d]= in.nextInt();
            }
        }
        System.out.println("enter the elements of the second matrix");
        for(int c = 0;c<m;c++){
            for(int d=0;d<n;d++){
                second[c][d]= in.nextInt();
            }
        }
        for(int c = 0;c<m;c++){
            for(int d=0;d<n;d++){
                sum[c][d]= first[c][d] + second[c][d];
            }
        }
        System.out.println("the sum of the two matrix is");
        for(int c = 0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.print(sum[c][d]+ "\t");
            }
            System.out.println();
        }

}}