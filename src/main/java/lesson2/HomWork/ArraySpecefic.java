package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArraySpecefic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        System.out.print("Enter the bound of array: ");
        int boundNum=scanner.nextInt();

        int[] arr=new int[num];

        for (int i = 0; i < num; i++) {
            arr[i]=random.nextInt(1,boundNum);
            System.out.println(" arr["+i+"]= "+arr[i]);
        }
        System.out.print("Enter the specefic number: ");
        int speceficNumber=scanner.nextInt();
        boolean ifElse=true;
        for (int i = 0; i < num; i++) {
            if (speceficNumber == arr[i]) {
                System.out.println("The Array contains a specefic value: ");
                System.out.println("The index of specefic value is= " + i);
                break;
            } else {
                ifElse=false;
            }
        }
    }
}
