package lesson1;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scannerin = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scannerin.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (j == n) {
                    System.out.println("*");
                } else System.out.print("*");
        }
    }
}
