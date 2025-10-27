package Exercise_23rdOCT;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Input.Please enter the correct number");
        }
        int num = sc.nextInt();
        int reverse = 0;
        int original = num;

        while (num > 0) {
            int last = num % 10;
            reverse = reverse * 10 + last;
            num = num / 10;
        }
        if(original==reverse)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The umber is not a palindrome");
        }

    }
}
