package Ex13_Functions;

import java.util.Scanner;

public class Lab034_Functions {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        float result = division_of_numbers(a,b);
        System.out.println("The division of numbers is " +result);
        double d = 9.78;
        int i = (int) d;
        System.out.println(i);



    }

    static float division_of_numbers(int a, int b)
    {
        return (float )a/b;
    }
}
