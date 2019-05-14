package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("  \033[1;34m Welcome to matrix calculator");
        System.out.println("  choose what you  want to do ? \n" +
                "   1. addition\n" +
                "   2. subtraction\n" +
                "   3. multiplication\n" +
                "   4. division\n" +
                "   5. scalar multiplication\n" +
                "   6. determinants \n" +
                "   7. transpose \n"+
                "\033[0m");
        System.out.println(  "\033[1;32m   enter the choice : ( example 1 , etc.) :->");
        int choice = in.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("you choose addition");
                addition add = new addition();
                add.add();
                break;
            }
            case 2: {
                System.out.println("you choose substraction");
                subtraction sub = new subtraction();
                sub.sub();
                break;
            }
            case 3: {
                System.out.println("you choose multiplication");
                multiplication multi = new multiplication();
                multi.multi();
                break;
            }
            case 4: {
                System.out.println("you choose division");
                division div = new division();
                div.div();
                break;
            }
            case 5: {
                System.out.println("you choose scalar multiplication");
                scalarMultiplication scalar = new scalarMultiplication();
                scalar.scalar();
                break;
            }
            case 6: {
                System.out.println("you choose determinants");
                determinants deter = new determinants();
                deter.deter();
                break;
            }
            case 7: {
                System.out.println("you choose transpose");
                transpose transpose = new transpose();
                transpose.transpose();
                break;
            }

            default: {
                System.out.println("invalid value added");
                break;
            }
        }
    }
}