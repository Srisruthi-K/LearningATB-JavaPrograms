package Exercise_23rdOCT;

import java.util.Scanner;

public class Armstrong {

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

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

    }
}

