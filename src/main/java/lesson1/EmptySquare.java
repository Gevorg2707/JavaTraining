package lesson1;

import java.util.Scanner;

public class EmptySquare {
    public static void main(String[] args) {
        Scanner scannerin=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=scannerin.nextInt();
        for (int i=0;i<number;i++){
            for(int j=0;j<number;j++){

                //the first
                if ((i==0&j<(number-1))) System.out.print("*");
                else if(i==0&j==(number-1)) System.out.println("*");
                //middle lines
                if ((i>0&i<(number-1)&j==0)) System.out.print("*");
                else if((i>0&i<(number-1)&j>0&j<(number-1))) System.out.print(" ");
                else if ((i>0&i<(number-1)&j==(number-1))) System.out.println("*" );

                //the last line
                if ((i==(number-1)&j<(number-1))) System.out.print("*");
                else if(i==(number-1)&j==(number-1)) System.out.println("*");


            }
        }
    }
}
