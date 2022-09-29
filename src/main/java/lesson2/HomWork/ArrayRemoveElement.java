package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayRemoveElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();


        System.out.print("num = ");
        int num=scanner.nextInt();
        System.out.print("Origin: ");
        int originRandom=scanner.nextInt();
        System.out.print("Bound of random, but don't less then Origin: ");
        int boundRandom=scanner.nextInt();
        System.out.print("Enter any number: ");
        int anyNumber=scanner.nextInt();
        int indexNumber=0;
        int[] arr=new int[num];
        int[] arr2=new int[num-1];
        boolean ifElse=true;
        boolean ifEl=false;


        for (int i = 0; i < num; i++) {
            arr[i]=random.nextInt(originRandom,boundRandom);
            System.out.println("arr["+i+"]= " + arr[i]);
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] == anyNumber) {
                ifElse=true;
                indexNumber=i;
                System.out.println("indexNumber = " + indexNumber);
                break;
            } else {
                ifElse = false;
                continue;
            }
        }
        if (ifElse==true){

            for (int i = 0; i < (num-1); i++) {
                if(indexNumber==i) {
                arr2[i]=arr[i+1];
                ifEl = true;
            } else if(ifEl==true) arr2[i]=arr[i+1];
                else if (ifEl==false)  {
                    arr2[i]=arr[i];
                    continue;
                }
            }
        }

        if(ifElse==true) {
            System.out.println("Array after deleting ");
            for (int i = 0; i < (num - 1); i++) {
                System.out.println("arr2[" + i + "]=" + arr2[i]);
            }
        } else System.out.println("The value "+anyNumber+" don't contain in Array");
    }
}
