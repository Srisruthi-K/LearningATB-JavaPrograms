package Ex_Ifelse_questions;

import java.util.Scanner;

public class odd_even_validation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("The number is an even number");
            } else {
                System.out.println("The number is an odd number");
            }
        }
            else
            {
                System.out.println("Enter an integer to determine whether its odd or even");
            }
        }
}
