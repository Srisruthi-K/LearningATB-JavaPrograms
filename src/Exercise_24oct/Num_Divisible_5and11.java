package Exercise_24oct;

import java.util.Scanner;

public class Num_Divisible_5and11 {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input.Enter a valid number");
            return;
        }
        int num = sc.nextInt();
        sc.close();
        if(num<=0)
        {
            System.out.println("Invalid input.Enter a valid postive number");
            return;
        } else if (num%5==0 && num%11 ==0) {
            System.out.println("Number is divisible by both 5 and 11");
            
        }
        else {
            System.out.println("Number is not divisible by both 5 and 11");
        }
    }
}
