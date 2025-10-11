package Ex11_While;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab032_Facotial_while {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int result = 1;
        System.out.println("Enter the enter for the factorial to be calculated");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if(num < 20) {
            int result =1;
            if(num==0){
                result=1;
            }
            if(num < 0 )
            {
                System.out.println("Cant get the factorial for negative numbers");
            }
            int i = 1;

                while (i <= num) {
                    result = result * i;
                    i++;
                }
                    System.out.println("The factorial of the number is " + result);
                }
            else if (num >=20)
            {
                BigInteger result = BigInteger.ONE;
                for(int i=1; i<=num; i++)
                {
                    result = result.multiply(BigInteger.valueOf(i));
            }
                System.out.println("The factorial of the number is " + result);
        }

            {}
        } else {
            System.out.println("Enter an integer number for the factorial to be calculated");
        }
    }
}
