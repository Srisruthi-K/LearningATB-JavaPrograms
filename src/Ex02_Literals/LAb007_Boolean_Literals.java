package Ex02_Literals;

import java.util.Scanner;

public class LAb007_Boolean_Literals {
    public static void main(String[] args) {
        boolean Adult;
        boolean Child;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();

        // assign boolean values based on age
        Adult = age >= 18;
        Child = age < 18;

        System.out.println("Is Adult? " + Adult);
        System.out.println("Is Child? " + Child);

        sc.close();
    }
}
