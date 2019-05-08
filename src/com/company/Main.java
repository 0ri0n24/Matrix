package com.company;

import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to matrix calculator");
        Main use = new Main();
        use.choose();
    }

    private void choose() {
        System.out.println("choose what you want to do : ");
        System.out.println(" 1. Addition" +
                "\n 2. Subtraction " +
                "\n 3. Multiplication" +
                "\n 4. scalerMultiplication" +
                "\n 5. Determinants" +
                "");
        Switch();
    }

    private void Switch() {
        System.out.println("enter the the number:");
        int num = in.nextInt();
        switch (num) {
            case 1: {
                addition();
            }
            case 2:{
                subtraction();
            }
            case 3:{
                multiplication();
            }
            case 4:{
                scalerMultiplication();
            }
            case 5:{
                determinants();
            }
        }

    }

    private int[][] parameters() {
        int row, col;
        System.out.println("enter the numbers of rows and columns in the matrix");
        row = in.nextInt();
        col = in.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("enter values:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        return mat;
    }

    private void addition() {
        System.out.println("enter values in first matrix");
      int z[][]=  parameters();
        System.out.println("enter values in second matrix");
       int y[][]= parameters();
       for(int i=0; i<z.length;i++)
           for(int j=0 ;j< y.length;j++) {

           }}
    }
    private void subtraction(){}
    private  void multiplication (){}
    private void scalerMultiplication(){}
    private void determinants(){}
}

