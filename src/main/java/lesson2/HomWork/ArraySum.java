package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner inscan=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Enter tne number: ");
        int number=inscan.nextInt();
        System.out.print("Enter the bound of array: ");
        int boundNum=inscan.nextInt();
        int[] arr=new int[number];
        int sum;
        for (int i = 0; i < number; i++) {
            arr[i]=random.nextInt(1,boundNum);
            System.out.println(" arr["+i+"]= "+arr[i]);
        }
        sum=0;
        for (int i = 0; i < number; i++) {
            sum=sum+arr[i];
        }
        System.out.print("sum of array: = " + sum);
    }
}
