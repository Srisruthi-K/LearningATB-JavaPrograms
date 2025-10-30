package Exercise_24oct;

import java.util.Scanner;

public class Days_to_Years_months_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.Enter valid days");
            return;
        }
        int input = sc.nextInt();
        sc.close();
        int years = 0;
        int month = 0;
        int fin_days = 0;
        if (input >= 365) {
            years = input/ 365;
            input = input - (365 * years);
        }
        if (input >= 30) {
            month = input /30;
            input = input - (30 * month);
        }
        if (input < 30) {
            fin_days = input;
        }
        System.out.println("The days entered is " + years + " years " + month+ "months " + fin_days +" days");

    }

//    int years = input / 365;
//    int remainingDays = input % 365;
//    int months = remainingDays / 30;
//    int days = remainingDays % 30;
}
