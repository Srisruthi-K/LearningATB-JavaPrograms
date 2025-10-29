package Exercise_23rdOCT;

import java.util.Scanner;

public class salary_experience_calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.Enter correct salary");
            return;
        }
        int salary = sc.nextInt();
       // sc.close();
        System.out.println("Enter the years of experience");
        if (!sc.hasNextFloat()) {
            System.out.println("Invalid input.Enter correct YOE");
            return;
        }
        float YOE = sc.nextFloat();
        sc.close();
        double bonus = 0;
        if (YOE < 1) {
            System.out.println("Bonus is " + bonus);
        } else if (YOE >= 1 && YOE <= 3) {
            bonus = salary * 0.05;
            System.out.println("Bonus is " + bonus + "for salary of " + salary);
            return;
        } else if (YOE > 3 && YOE <= 6) {
            bonus = salary * 0.1;
            System.out.println("Bonus is " + bonus + "for salary of " + salary);
            return;
        } else if (YOE > 6) {
            bonus = salary * 0.15;
            System.out.println("Bonus is " + bonus + "for salary of " + salary);
            return;
        }
    }
}
