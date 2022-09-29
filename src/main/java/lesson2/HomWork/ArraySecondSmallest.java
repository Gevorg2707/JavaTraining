package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArraySecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Print the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int secondSmallestEl,smallestEl;



        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=  " + arr[i]);
        }
        smallestEl=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(smallestEl<arr[i])
                continue;
            else smallestEl=arr[i];
        }
        secondSmallestEl=arr[0];
        for (int i = 0; i < arr.length; i++) {
          if(secondSmallestEl<arr[i]&secondSmallestEl!=smallestEl)
                secondSmallestEl=arr[i];
            else secondSmallestEl=arr[i];
        }
        System.out.println("smallestEl = " + smallestEl);
        System.out.println("secondSmallestEl = " + secondSmallestEl);
    }
}
