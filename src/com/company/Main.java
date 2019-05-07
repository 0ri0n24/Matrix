package com.company;
import java.util.Scanner;
public class Main {
Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to matrix calculator");
        Main use = new Main();
        use.choose();
        use.parameters();
    }
     public void choose(){
         System.out.println("choose what you want to do : ");
         System.out.println(" 1. Addition" +
                            "\n 2. Subtraction " +
                            "\n 3. Multiplication" +
                            "");

     }
     public void parameters(){

         System.out.println("enter the numbers of rows and columns in the matrix");
         int row,col;
         row = in.nextInt();
         col=in.nextInt();
         System.out.println(" you enter the number of rows = "+ row + " and columns = "+ col);


     }

}
