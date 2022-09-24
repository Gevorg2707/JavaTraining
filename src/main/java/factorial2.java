import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner scannerin = new Scanner(System.in);
        System.out.print("Enter any number: ");
        long ifnumber = scannerin.nextInt();
        long fact=1;
        for (int i=1;i<=ifnumber;i++){
            fact=fact*i;
            if(i==ifnumber) System.out.println("The factorial of "+ifnumber+" is equal "+fact);


        }
    }
}
