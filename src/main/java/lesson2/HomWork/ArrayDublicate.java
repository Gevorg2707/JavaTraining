package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayDublicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int index;
        boolean ifelse;

        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("arr["+j+"]: "+arr[j]+" and index is: "+j);
                }
            }
        }
    }
}