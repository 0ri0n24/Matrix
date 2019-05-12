package com.company;
import java.util.Scanner;
public class division {
    void div(){
        Scanner in = new Scanner(System.in);
        int m,n;
        System.out.println("enter the number of the rows and column :");
        m=in.nextInt();
        n=in.nextInt();
        int [][]first = new  int[m][n];
        int [][]second = new int[m][n];
        int [][]div = new int[m][n];
        System.out.println("enter the elements of the first matrix");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                first[c][d]= in.nextInt();
            }
        }
        System.out.println("enter the elements of the second matrix");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                second[c][d]=in.nextInt();
            }
        }
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                div[c][d]= first[c][d] / second[c][d];}
        }

        System.out.println("the division of the two matrix gives :");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.println(div[c][d] + "\t");
            }
            System.out.println();
        }
    }

}
