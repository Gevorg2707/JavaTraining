import java.util.Scanner;

public class fibonachiN1 {
    public static void main(String[] args) {
        Scanner scannerin = new Scanner(System.in);
//        System.out.print("Enter count of fibonachi number:");
//        long number = scannerin.nextInt();
        System.out.print("Enter any number: ");
        long ifnumber = scannerin.nextInt();
        long fib1 = 1;
        long fib2 = 1;
        long fib3;
        boolean aa=false;

        for (int i = 3; i <= ifnumber; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            if (fib3 == ifnumber) {
                System.out.println(ifnumber + "is right number");
                System.out.println(ifnumber+" is the "+i+"-d number");
                aa=true;
                break;
            }

        }
        if (aa==false) {
            System.out.println(ifnumber + "is wrong number");
        }
    }
}

