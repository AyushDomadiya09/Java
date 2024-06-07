// W.A.P. to check given number is odd or even using bitwise operator.

import java.util.Scanner;

public class oddevenBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        if((n&1) == 1)
        {
            System.out.println(n + " is a odd number");
        }
        else
        {
            System.out.println(n + " is a even number");
        }
    }
}
