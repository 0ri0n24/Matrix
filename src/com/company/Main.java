package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to matrix calculator");
        System.out.println("choose what you  want to do ? \n" +
                "1. addition\n" +
                "2. subtraction\n" +
                "3. multiplication\n" +
                "4. division\n" +
                "5. scalar multiplication\n" +
                "6. determinants \n" +
                "7. transpose \n");
        System.out.println("enter the choice : ( example 1 , etc.) :->");
        int choice = in.nextInt();

        switch (choice) {
            case 1: {
                addition add = new addition();
                add.add();
                break;
            }
            case 2: {
                subtraction sub = new subtraction();
                sub.sub();
                break;
            }
            case 3: {
                multiplication multi = new multiplication();
                multi.multi();
                break;
            }
            case 4: {
                division div = new division();
                div.div();
                break;
            }
            case 5: {
                scalarMultiplication scalar = new scalarMultiplication();
                scalar.scalar();
                break;
            }
            case 6: {
                determinants deter = new determinants();
                deter.deter();
                break;
            }
            case 7:{
                transpose transpose = new transpose();
                transpose.transpose();
            }
        }
    }
}