package lesson1;

import java.util.Scanner;

public class Triangledouble {
    public static void main(String[] args) {
        Scanner inscanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
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
            }
        }

        for (int i=0;i<num;i++) {
            for(int j=0;j<(num-i-1);j++){
                if (j == 0) System.out.print("*");
                else if (j > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
