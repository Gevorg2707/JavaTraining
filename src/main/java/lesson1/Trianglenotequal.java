package lesson1;

import java.util.Scanner;

public class Trianglenotequal {
    public static void main(String[] args) {
        Scanner inscanner=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=inscanner.nextInt();
        System.out.print("Enter the number2: ");
        int num2=inscanner.nextInt();

        for(int i=0;i<num1;i++) {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
