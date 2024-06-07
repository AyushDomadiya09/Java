// W.A.P. to check given number is prime or not

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int x = sc.nextInt();

        int flag=0;

        for(int i = 2 ; i<x/2 ; i++)
        {
            if(x%i==0)
            {
                flag = 1;
            }
        }

        if(flag==1)
        {
            System.out.println(x + " is not a prime number.");
        }
        else
        {
            System.out.println(x + " is a prime number.");
        }
    }
}
