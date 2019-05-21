package com.company;
import java.util.Scanner;
public class InverseOfA {
    void InverseOfA(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the rows and column of the matrix");
        int m= in.nextInt(), n= in.nextInt();
determinants deter = new determinants();
deter.deter();
        System.out.println(deter);

    }
}
