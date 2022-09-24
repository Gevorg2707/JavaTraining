package lesson1;

import java.util.Scanner;

public class EmptyTriangle {
    public static void main(String[] args) {
        Scanner inscanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=inscanner.nextInt();
        for (int i=0;i<num;i++){
            if (i<(num-1)) {
                for (int j = 0; j < i; j++) {
                    if (j == 0) System.out.print("*");
                    else if (j > 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            } else if (i==(num-1)) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
