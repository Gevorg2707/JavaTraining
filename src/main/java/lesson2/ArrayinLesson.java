package lesson2;

import java.util.Scanner;

public class ArrayinLesson {
    public static void main(String[] args) {
        Scanner inscan=new Scanner(System.in);
        int [] arr2=new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=i+1;
        }
        int [] arr3=new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i]=i+1;
        }

        boolean aa=true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=arr3[i]) {
                aa=false;
                break;
            }
        }
        System.out.println(aa);


    }
}
