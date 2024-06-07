// W.A.P. to check given number is palindrome or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int temp = n;
        int rev = 0;

        while (n>0)
        {
            int a = n%10;
            rev = rev*10 + a;
            n = n/10;   
        }

        if(rev==temp)
        {
            System.out.println(temp + " is a palindrome number.");
        }
        else
        {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}
