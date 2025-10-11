package Ex10_Forloop;

import java.util.Scanner;

public class Ex030_Factorial {

    public static void main(String [] args){
        int result = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for the factorial needed");
        if(sc.hasNextInt()){  //for making sure the input is an integer;
        int num = sc.nextInt();
        if(num==0){
            result=1;//for handling the factorial of 0.
        }
        for (int i = 1; i<=num; i++)
        {
           result =i* result;
        }
        System.out.println("The factorial of the given number is " + result);
    }
        else {
            System.out.println("Please enter an integer for factorial calculation");
        }
}
}
