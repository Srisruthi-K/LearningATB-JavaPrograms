package Exercise;

import java.util.Scanner;

public class smallest_two_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a,b;
        if(sc.hasNextInt()) {
             a = sc.nextInt();
        }
        else {
            System.out.println("Invalid input.Enter a valid first number");
            return;
        }
        if(sc.hasNextInt()) {
             b = sc.nextInt();
        }
        else {
            System.out.println("Invalid input.Enter a valid second number");
            return;
        }
        if(a< b)
        {
            System.out.println("Smallest number is " +a);
        }
        else if(a==b)
        {
            System.out.println("Two numbers are equal.Enter different numbers");

        }
        else {
            System.out.println("Smallest number is " +b);
        }
    }
}
