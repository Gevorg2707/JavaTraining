package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner inscan=new Scanner(System.in);
        Random inranom=new Random();
        System.out.print("Enter the number: ");
        int num=inscan.nextInt();
        int a=inranom.nextInt(1,100);
        System.out.println("a = " + a);
        boolean ifElse=true;
        int [] arr1=new int[num];
        for (int i = 0; i < num; i++) {
            arr1[i]= inranom.nextInt(-100,100);
            System.out.println("arr1["+i+"]= " + arr1[i]);;
        }
        int max = arr1[0];
        for (int i = 0; i < num; i++) {
            if( arr1[i]>max) max=arr1[i];
        }
        System.out.print("Maximum of array: "+max);
    }
}
