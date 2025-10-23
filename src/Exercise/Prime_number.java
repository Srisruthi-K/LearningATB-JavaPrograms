package Exercise;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args)

    {
        Scanner sc =new Scanner(System.in);
        boolean status = true;
        System.out.println("Enter value to determine prime number or not");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter a valid input!");
            return;
        }
        else
        {
            int num= sc.nextInt();
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
                return;
            }
            for(int i=2; i<=num/2;i++) {
                if (num % i == 0)
                {
                    status = false;
                    break;
                }
            }
            if(status== false)
            {
                System.out.println("The number  " + num + " is  not a prime number");
            }
            else
            {
                System.out.println("The number  " + num + " is a prime number");
            }
        }

    }
}
