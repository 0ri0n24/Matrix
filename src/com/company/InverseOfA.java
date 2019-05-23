package com.company;

import java.util.Scanner;


 class InverseOfA extends Main {
    void InverseOfA(){
        Scanner in  = new Scanner(System.in);
        System.out.println("enter the number(must be a square matrix) of the rows and column:");


determinants deter = new determinants();
deter.deter(m,n);
        System.out.println(m +" "+ n);

    }



}