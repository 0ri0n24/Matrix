package com.company;
import java.util.Scanner;

public class determinants {
    static int deter,m,n;
    int  deter( int m , int  n){
        System.out.println("enter rows and column");
        Scanner in = new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        if((m>0 && n>0 )&&(m<4 &&n<4)){
        int [][] first = new  int[m][n];

        System.out.println("enter the elements of the  matrix");

        for(int c=0;c<m;c++)
            for(int d=0;d<n;d++)
                first[c][d]= in.nextInt();

        if(m<2&&n<2 ){
            System.out.println("determinant is :" +first[0][0]);
            return deter;

        }
        else if((m<3 && n<3 ) && (m>1 && n>1)){
            int c=0 ,d=0;
           deter =first[c][d]*first[c+1][d+1] - first[c+1][d]*first[c][d+1];
            System.out.println("determinant is: "+deter);
            return deter;
        }
        else if(m>2 && n>2){

            int c=0 ,d=0;
            int x= first[c][d] * ((first[c+1][d+1] * first[c+2][d+2]) - ( first[c+2][d+1] * first[c+1][d+2]));
            int y= first[c][d+1] * ((first[c+1][d] * first[c+2][d+2] ) - ( first[c+2][d] * first[c+1][d+2]));
            int z= first[c][d+2] * ((first[c+1][d] * first[c+2][d+1] ) - ( first[c+2][d] * first[c+1][d+1]));
             deter = x -y +z;
        System.out.println("determinant is :" +deter );
return deter;
        }


    }
    else {
            System.out.println("invalid rows and column entered");}
    return deter = 0;
    }
}

