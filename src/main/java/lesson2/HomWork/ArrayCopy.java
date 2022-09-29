package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Print the size of Array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int[] arr2=new int[size];
        System.out.println("Print the element of Array");
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
            arr2[i]=arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr["+i+"]=  "+arr[i]);
            System.out.println("arr2["+i+"]= "+arr2[i]);


        }
    }
}
