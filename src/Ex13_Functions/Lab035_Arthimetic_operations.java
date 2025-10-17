package Ex13_Functions;
import java.util.*;

public class Lab035_Arthimetic_operations {
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int addition= Addition(a,b);
        int subtraction = subtraction(a,b);
        int multiplication = multiplication(a,b);
        float division = division (a,b);
        System.out.println("Sum is "+ addition);
        System.out.println("Difference is "+ subtraction);
        System.out.println("Multiplication is "+ multiplication);
        System.out.println("division is "+ division);

    }
    public static int Addition(int a, int b)
    {
        return a+b;
    }
    public static int subtraction(int a , int b)
    {
        return a-b;
    }

    public static int multiplication(int a , int b)
    {
        return a*b;
    }
    public static float division(int a , int b)
    {
        return (float) a/b;
    }

}
