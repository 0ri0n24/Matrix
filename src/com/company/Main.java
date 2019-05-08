package com.company;
import java.util.Scanner;
public class Main {
private Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to matrix calculator");
        Main use = new Main();
        use.choose();
        use.parameters();
    }
     private void choose(){
         System.out.println("choose what you want to do : ");
         System.out.println(" 1. Addition" +
                            "\n 2. Subtraction " +
                            "\n 3. Multiplication" +
                            "");

     }

     private void parameters() {
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
    }
    }

