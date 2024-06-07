import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);

        for(int i=0 ; i<=n ; i++)
        {
            for(int j=0 ; j<=n ; j++)
            {
                if(i==0 || i==n || j==0 || j==n)
                {
                    System.out.print(c);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
