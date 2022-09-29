package lesson3;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArrayWithRandomNumbers(arr);
        printArr(arr);
        widenArray(arr,2);
        printArr(arr);
    }

    private static void printArr(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint[i]; i++) {
        }
    }

    private static void fillArrayWithRandomNumbers(int[] arr){
            Random random=new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= random.nextInt(50);
        }
}
    public static int[] widenArray(int[] arr,int mutliple) {
        int[] largeArray = new int[arr.length * mutliple];
        for (int i = 0; i < arr.length; i++) {
            largeArray[i] = arr[i];
        }
        return largeArray;
    }
}



