package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayAddValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter size of Array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];

        System.out.println("Add element into the Array: ");
        int addValue=scanner.nextInt();
        int aaa;
        int position= random.nextInt(1,(size-1));

        System.out.println("Print the elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arr["+i+"]=  "+arr[i]);
        }

        arr[position]=addValue;
        System.out.println("Change the value of position: = " + position);
        System.out.println("The Array after changing: ");
        for (int i = 0; i < size; i++) {
            System.out.println("arr["+i+"]=  "+arr[i]);

        }
    }
}
