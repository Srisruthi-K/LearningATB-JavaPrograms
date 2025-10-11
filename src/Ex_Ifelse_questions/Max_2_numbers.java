package Ex_Ifelse_questions;

import java.util.Scanner;

public class Max_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid number");
            sc.close();
            return;
        }
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input! Please enter a valid number");
            sc.close();
            return;
        }
        float num2 = sc.nextFloat();
        if(num1>num2)
        {
            System.out.println("First number is the greatest");
        } else if (num1< num2)
        {
            System.out.println("second number is the greatest");
        } else if (num1 ==num2)
        {
            System.out.println("Both numbers are equal");
        }
    }
}
       /* {
            float num1 = sc.nextFloat();
            System.out.println("Enter the second number");
            if (sc.hasNextFloat()) {
                float num2 = sc.nextFloat();
                if (num1 > num2) {
                    System.out.println("First number is greatest");
                } else {
                    System.out.println("Second number is greatest");
                }
            } else
            {
                System.out.println("Invalid input! Please enter a valid number");
            }

        } else {
            System.out.println("Invalid input! Please enter a valid number");

        }
    }
}
*/