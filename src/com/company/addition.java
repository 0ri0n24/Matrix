package com.company;
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number of rows and columns  ");
        int row = in.nextInt();
        int column = in.nextInt();
        System.out.println("enter the values in the matrix");
        int [][] add = new  int[4][5] ;
        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++){
                add[i][j]= in.nextInt();
            }

        }
        System.out.println("output");
        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++) {
                System.out.println(add[i][j]);
            }
    }
}}