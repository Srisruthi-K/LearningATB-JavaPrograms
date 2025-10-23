package Exercise;

import java.util.Scanner;

public class Valid_triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c =0;
        System.out.println("Enter the three sides of the triangle");

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input for first side.");
            return;
        }
        a = sc.nextInt();

       if(!sc.hasNextInt())
       {
           System.out.println("Invalid input for second side.");
           return;
       }
        b = sc.nextInt();

        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input for third side.");
            return;
        }
        c = sc.nextInt();
        if(a<=0 ||b<=0|| c<=0)
        {
            System.out.println("Enter the sides greater than zero");
            return;
        }
        if(a+b >c && b+c> a && c+a > b )
        {
            System.out.println("The triangle is  valid");
        }
        else
        {
            System.out.println("The triangle is invalid");
        }

    }
}
