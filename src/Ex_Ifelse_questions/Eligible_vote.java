package Ex_Ifelse_questions;

import java.util.Scanner;

public class Eligible_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input.Enter the age");
            sc.close();
            return;
        }
        int age = sc.nextInt();
         if(age>=18)
         {
             System.out.println("Person is eligible to vote");
         }
         else if(age <= 0)
         {
             System.out.println("Invalid input.Enter the age");
         }
         else
         {
             System.out.println("Person is not eligible to vote");
         }

    }
}
