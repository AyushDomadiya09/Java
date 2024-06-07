// W.A.P. to read n numbers in an array and print the sum of odd numbers & even numbers.

import java.util.*;

public class sumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        int odd = 0;
        int even = 0;

        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print("Enter Element ");
            arr[i] = sc.nextInt();
        }

        for(int j=0 ; j<arr.length ; j++)
        {
            if(arr[j]%2 == 0)
            {
                even = even + arr[j];
            }
            else
            {
                odd = odd + arr[j];
            }
        }

        System.out.println("Sum of odds : " + odd);
        System.out.println("Sum of evens : " + even);
    }
}