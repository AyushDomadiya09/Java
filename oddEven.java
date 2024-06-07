import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Positive Number : ");
        int a = sc.nextInt();

        switch (a&1) {
            case 1:
                System.out.println(a + " is a Odd Number.");
                break;
            case 0:
                System.out.println(a + " is a Even Number.");
                break;
            default:
                
                break;
        }
    }
}
