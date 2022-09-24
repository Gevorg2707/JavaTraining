import java.util.Scanner;

public class square1 {
    public static void main(String[] args) {
        Scanner scannerin = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scannerin.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++)
//                if (j == n) {
//                    System.out.println("*");
//                } else System.out.print("*");
//        }
//        for (int i =0;i <n; i++) {
//            for (int j =0; j <i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

        for (int i =0;i <=n; i++) {
            for (int j =0; j <i; j++) {
                System.out.print("*");
            }
            {System.out.println("*");
            }
        }
    }
}
