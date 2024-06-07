// W.A.P. to print odd numbers that are divisible by 7 but not divisible by 3 between 150 and 445.

import java.util.*;

public class divideby7 {
    public static void main(String[] args) {
        int n1 = 150;
        int n2 = 445;
        for (int i = 150; i <= n2; i++) {
            if (i % 2 != 0 && i % 7 == 0 && i % 3 != 0) {
                System.out.print(i + ",");
            }
        }
    }
}
