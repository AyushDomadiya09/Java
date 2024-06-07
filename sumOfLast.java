import java.util.Scanner;

public class sumOfLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();

        int x = a%10;
        int y = b%10;

        System.out.println("Sum of last Digits = " + (x+y));
    }
}
