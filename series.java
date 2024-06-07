// W.A.P. to print series 1, 3, 6, 10, 15, …

import java.util.*;

public class series {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Steps : ");
        int n = sc.nextInt();

        int temp = 0;

        for(int i=1 ; i<=n ; i++)
        {
            temp = temp + i;

            System.out.print(temp + ",");
        }
    }
}