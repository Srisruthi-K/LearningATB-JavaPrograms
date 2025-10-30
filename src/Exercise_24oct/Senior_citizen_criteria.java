package Exercise_24oct;

import java.util.Scanner;

public class Senior_citizen_criteria {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input.Enter correct age.");
            return;
        }
        int age= sc.nextInt();
        sc.close();
        if (age < 0)
        {
            System.out.println("Enter non-negative number for age");
            return;
        }
        else if(age<=12)
        {
            System.out.println("Person category is a child");
        }
        else if(age>=13 && age<=19)
        {
            System.out.println("Person category is a teenager");
        }
        else if(age>=20 && age<=64)
        {
            System.out.println("Person category is an adult");
        }
        else if(age>=65)
        {
            System.out.println("Person category is a senior citizen");
        }
    }
}
