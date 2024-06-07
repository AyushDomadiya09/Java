//W.A.P. to find the largest number from given 3 numbers using conditional operator.

import java.util.*;

public class largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();
        
        System.out.print("Enter Number 3 : ");
        int c = sc.nextInt();

        int max = (a>b) ? (a>c?a:c) : (b>c?b:c);

        System.out.println("Largest Number is " + max);
    }
}