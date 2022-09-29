package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Enter the number: ");
        int num=scanner.nextInt();
        System.out.print("Enter the bound of array: ");
        int boundNum=scanner.nextInt();
        int[] arr=new int[num];
        int sum, average;
        for (int i = 0; i < num; i++) {
            arr[i]=random.nextInt(1,boundNum);
            System.out.println(" arr["+i+"]= "+arr[i]);
        }
        sum=0;
        for (int i = 0; i < num; i++) {
            sum=sum+arr[i];
        }
        average=sum/num;
        System.out.println("Average of array= " + average);


    }
}
