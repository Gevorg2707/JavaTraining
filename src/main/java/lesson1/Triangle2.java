package lesson1;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner inscan=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inscan.nextInt();
        int num2;
        int k=0;

        for (int i =0 ; i< num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
                k++;
            }
            num2 = (num - k) * 2 + 1;
            for (int p = 0; p < num2; p++) {
                System.out.print("*");
            }
            for (int l = 0; l < k; l++) {
                if (l < (k - 1)) System.out.print(" ");
                else System.out.println(" ");
            }
            k = 0;
        }
        for (int i =0 ; i< num; i++) {
            for (int j = 0; j > num; j++) {
                if(j==0&i==0) System.out.print(" ");
            }
        }
    }
}
