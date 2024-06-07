import java.util.*;

public class bill
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Units consumed : ");
        double u = sc.nextDouble();

        double b = 1;
        if(u<=200)
        {
            b = u*0.8;
        }
        else if(u>200 && u<=300)
        {
            b = 160 + (u-200)*0.9;
        }
        else
        {
            b = 250 + (u-300)*1;
        }

        if(b>300)
        {
            b = b + b*0.1236;
            System.out.println("Total Bill = " + b);
        }
        else
        {
            System.out.println("Total Bill = " + b);
        }
    }
}