package Exercise_23rdOCT;

import java.util.Scanner;

public class Armstrong {
//An Armstrong number (also called a narcissistic number) is a number that is equal
// to the sum of its digits each raised to the power of the number of digits.

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;
        int n = Math.abs(num); // handle negative numbers

        if (n == 0) {
            count = 1; // zero has 1 digit
        } else {
            while (n > 0) {
                n = n / 10;  // remove the last digit
                count++;     // increment the digit count
            }
        }

        System.out.println("Number of digits: " + count);
        int temp=num;
        int power =1;
        int sum=0;
        while(temp!=0) {
            int digit = temp % 10;//last digit

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }
            sum = sum + power;
            power=1;
            temp = temp / 10; //remove the last digit
        }
        if(sum==num)
        {
            System.out.println("Number is an armstrong number");
        }
        else
        {
            System.out.println("Number is not an armstrong number");
        }
    }
}

