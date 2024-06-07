import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.print("Enter Number 3 : ");
        int c = sc.nextInt();

        int small = (a<b) ? (a<c?a:c) : (b<c?b:c);
        int large = (a>b) ? (a>c?a:c) : (b>c?b:c);
        int x = (a+b+c) - (small+large);

        System.out.println(small + "," + x + "," + large);
    }
}
