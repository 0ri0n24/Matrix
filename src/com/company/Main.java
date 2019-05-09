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

    private void parameters() {
        System.out.println("enter the number of rows and column:");
        int row = in.nextInt(), col = in.nextInt();
        for (int i = 0; i < row; i++) {
            for(int j=0; j<col; j++){
                int[][] accept = new int [i][j];
                accept[i][j] = in.nextInt();}
        }
    }
    private void addition() {
    Main get = new Main();
    get.parameters();
    }

    private void subtraction(){}
    private  void multiplication (){}
    private void scalerMultiplication(){}
    private void determinants(){}
}

