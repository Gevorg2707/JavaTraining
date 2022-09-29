package lesson3;

import java.util.Random;
import java.util.Scanner;

public class ArrayType {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();


        System.out.print("Size1: ");
        int size1=scanner.nextInt();
        System.out.print("Size2: ");
        int size2=scanner.nextInt();
        System.out.print("Size3: ");
        int size3=scanner.nextInt();
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];
        int[] arr3=new int[size3];

        for (int i = 0; i <size1 ; i++)
            arr1[i]= random.nextInt();

        for (int i = 0; i <size2 ; i++)
            arr2[i]= random.nextInt();

        for (int i = 0; i <size3 ; i++)
            arr3[i]= random.nextInt();

        for (int i = 0; i < size1; i++)
            System.out.println("arr1["+i+"]=" + arr1[i]);

        for (int i = 0; i < size2; i++)
            System.out.println("arr2["+i+"]=" + arr2[i]);

        for (int i = 0; i < size3; i++)
            System.out.println("arr3["+i+"]=" + arr3[i]);

    }


}
