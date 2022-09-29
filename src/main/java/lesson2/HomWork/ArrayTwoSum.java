package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayTwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] arr2=new int[2];
        System.out.print("Print the target: ");
        int target = scanner.nextInt();
        int el1;
        int el2;
        boolean ifElse;
        ifElse = false;

        System.out.println("Print the element of Array");
        for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) System.out.println("arr[" + i + "]=  " + arr[i]);

        for (int i = 0; i < arr.length; i++) {
            el1=target-arr[i];

            for (int j = 0; j < arr.length; j++) {
                if(i!=j&&arr[j]==el1) {
                    ifElse=true;
                    arr2[0]=arr[i];
                    arr2[1]=arr[j];
                }
            }
        }
        if(ifElse)
        System.out.println("arr2[0]="+ arr2[0]+", arr2[1] = " + arr2[1]);
        else System.out.println("Don't work");
    }
}