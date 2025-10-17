package Exercise;

import java.util.Scanner;

public class Character_alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        String s = sc.next();
        if (s.length() > 1) {
            System.out.println("Invalid input.Enter a single character");
            return;
        } else if ((s.length() == 1)) {
            char c = s.charAt(0);
            if ((c>='A'&& c<='Z')||(c>='a'&& c<='z')) {
                System.out.println("It is an alphabet");
            } else {
                System.out.println("It is not an alphabet");
            }
        }
    }
}
