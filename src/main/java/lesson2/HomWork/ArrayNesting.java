package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayNesting {
    public static void main(String[] args) {
        Scanner inscan=new Scanner(System.in);
        Random inrandom=new Random();
        System.out.print("Enter the number starts 1 to 100: ");
        int num=inscan.nextInt();
        int sum;
        System.out.print("Enter the number less then num: ");
        int k=inscan.nextInt();
        int a=inrandom.nextInt(1,100);
        int[] arr=new int[num];
        int[] arr2;
        for (int i = 0; i < num; i++) {
            arr[i]=inrandom.nextInt(1,100);
            System.out.println("arr["+i+"]=" + arr[i]);
        }
        sum=0;
        for (int i = 0; i < num; i++) {
            sum=sum+arr[i];
        }
        System.out.print("sum of array: = " + sum);
    }
}
