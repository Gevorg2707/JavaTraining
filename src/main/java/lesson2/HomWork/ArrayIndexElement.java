package lesson2.HomWork;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.print("num = ");
        int num=scanner.nextInt();
        System.out.print("StartRandom is: ");
        int startRandom=scanner.nextInt();
        System.out.print("Bound of random, but don't less then startRandom: ");
        int boundRandom=scanner.nextInt();
        int aa;

        int[] arr=new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = random.nextInt(startRandom, boundRandom);
            System.out.println("arr[" + i + "]=" + arr[i]);
            aa=arr[0];
            for (int j = 1; j < i; j++) {
                if (arr[j] == aa) {
                    i=i-1;
                    break;

                }
            }


        }

        System.out.print("Entet any number: ");
        int anyNumber=scanner.nextInt();

        boolean ifElse=true;

        for (int i = 0; i < num; i++) {
            if (arr[i] == anyNumber) {
                System.out.print("The index of anyNumber is: "+i);
                ifElse=true;
                break;
            } else {
            ifElse=false;
            continue;
            }
        }
        if (ifElse == false) {
            System.out.println("Array don't contain than value. ");

        }


    }
}
