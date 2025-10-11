package Ex_Ifelse_questions;

import java.util.Scanner;

public class vowel_consonant_validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = sc.next();
        if (input.length() != 1) {
            System.out.println("Enter a single character to determine if its a vowel or consonant");
            sc.close();
            return;
        } else if (input.equalsIgnoreCase("a") ||
                input.equalsIgnoreCase("e") ||
                input.equalsIgnoreCase("i") ||
                input.equalsIgnoreCase("o") ||
                input.equalsIgnoreCase("u") ) {
            System.out.println("Its a vowel");
            return;
        } else {
            System.out.println("It is a consonant");
        }
    }
}
