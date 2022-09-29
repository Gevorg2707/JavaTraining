package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.print("Print the size: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int min,max;

        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr["+i+"]=  "+arr[i]);
        }
        min=arr[0];
        max=arr[0];

        for (int i = 0; i < size; i++) {
           if(max>arr[i]) {
               max=arr[i];
           }
            if (min<arr[i]){
                min=arr[i];
            }
           }
        System.out.println("Max: "+min);
        System.out.println("Min: "+max);
        }
    }

