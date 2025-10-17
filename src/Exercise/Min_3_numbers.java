package Exercise;

import java.util.Scanner;

public class Min_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        double a, b, c;

        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        else
        {
            System.out.println("Invalid input for first number.");
            return;
        }
        if(sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        else{
            System.out.println("Invalid input for second number.");
            return;
        }
        if(sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        else{
            System.out.println("Invalid input for third number.");
            return;
        }
        if (a < b && a < c) {
            System.out.println("a is the smallest number " + a);
        } else if (b < c && b < a) {
            System.out.println("b is the smallest number " + b);
        } else if (c < a && c < b) {
            System.out.println("c is the smallest number " + c);
        } else if (a == b || a == c || b == c) {
            System.out.println("Two or more numbers are equal.Enter different numbers");
        }
    }

}

