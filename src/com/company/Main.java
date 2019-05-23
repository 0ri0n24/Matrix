package com.company;
import com.company.determinants;
import java.util.Scanner;

public class Main {
static int  m ,n ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choose;
        System.out.println("  \033[1;34m Welcome to matrix calculator");
       do{ System.out.println("  choose what you  want to do ? \n" +
                "   1. addition\n" +
                "   2. subtraction\n" +
                "   3. multiplication\n" +
                "   4. division\n" +
                "   5. scalar multiplication\n" +
                "   6. determinants \n" +
                "   7. transpose \n" +
                "   8. InverseOfA \n"+
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
                System.out.println("you choose subtraction");
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
                deter.deter(m,n);
                break;
            }
            case 7: {
                System.out.println("you choose transpose");
                transpose transpose = new transpose();
                transpose.transpose();
                break;
            }
            case 8:{
                System.out.println("you choose InverseOfA");
                InverseOfA InverseOfA = new InverseOfA();
                InverseOfA.InverseOfA();

            }

            default: {
                System.out.println("invalid value added");
                break;
            }

        }
       System.out.println("do you want to choose again y or n:");
        choose = in.next().charAt(0);}
    while(choose == 'y');

}}