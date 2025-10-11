package Ex_Ifelse_questions;

import java.util.Scanner;

public class positive_negative_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if (sc.hasNextFloat())
        {
            float num = sc.nextFloat();
            if(num>=0)
            {
                System.out.println("The number is a postive number");
            }
            else if(num<0)
            {
                System.out.println("The number is a negative number");
            }
        }
        else{
            System.out.println("Enter a number to determine whether its positive or negative");
        }
    }
}
