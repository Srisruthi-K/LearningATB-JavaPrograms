package Exercise_23rdOCT;

import java.util.Scanner;

public class Loan_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid age");
            sc.close();
            return;
        }
        int age = sc.nextInt();
        if (age < 0 || age< 18 || age>80) {

                System.out.println("Person is not eligible for loan based on age");
                return;
        }
        System.out.println("Enter the salary");
        if (!sc.hasNextDouble()) {
            System.out.println("Enter valid salary");
            sc.close();
            return;
        }
        double salary = sc.nextDouble();
        if(salary< 0 || salary< 30000)
        {
            System.out.println("Person is not eligible for loan based on salary");
            return;
        }

        System.out.println("Enter the credit score");
        if (!sc.hasNextInt()) {
            System.out.println("Enter valid credit score");
            sc.close();
            return;
        }
        int credit_score = sc.nextInt();
        if(credit_score < 0|| credit_score< 650 ||credit_score>850)
        {
            System.out.println("Person is not eligible for loan based on credit_score");
            return;
        }
        if(age >= 18 && age <= 80 && salary >= 30000 && credit_score > 650 && credit_score < 850 )
        {
            System.out.println("Person is eligible for loan");
        }
/*//if(age > 0 && salary > 0 && credit_score> 0)
        if (age > 0) {
            if (age >= 18 && age <= 80) {
                if (salary > 0) {
                    if (salary >= 30000) {
                        if (credit_score > 0) {
                            if (credit_score > 650 && credit_score < 850) {
                                System.out.println("Person is eligible for loan");
                            }
                        } else {
                            System.out.println("Person is not eligible for loan based on credit_score");
                        }
                    } else {
                        System.out.println("Person is not eligible for loan based on salary");
                    }
                }
            } else {
                System.out.println("Person is not eligible for loan based on age");
            }
        } else {
            System.out.println("Enter the valid positive age ");
        }*/
    }
}

