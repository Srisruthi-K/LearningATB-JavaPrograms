package Exercise;

import java.util.*;

public class Max_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > b && a > c) {
                System.out.println("a is the greatest number " + a);
            } else if (b > c && b > a) {
                System.out.println("b is the greatest number " + b);
            } else if (c > a && c > b) {
                System.out.println("c is the greatest number " + c);
            } else if (a == b || a == c || b == c) {
                System.out.println("Two or more numbers are equal.Enter different numbers");
            }
        } else {
            System.out.println("Enter an integer");
        }

    }
}
