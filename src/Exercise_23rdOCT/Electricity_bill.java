package Exercise_23rdOCT;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input.Enter correct units consumed");
            return;
        }
        int units = sc.nextInt();
        sc.close();
        double bill =0;
        if(units <= 0 )
        {
            System.out.println("Invalid input.Enter units consumed greater than zero");
            return;

        } else if (units<=100) {
            bill = 0.5*units;
            System.out.println("Bill is " + bill);
            return;
        } else if (units>=101 && units <=200) {
            bill = (100*0.5)+(units-100)*0.75;
            System.out.println("Bill is " + bill);
            return;
        }
        else if (units>=201 && units <=300) {
            bill = (100*0.5)+(100*0.75)+(units-200)*1.2;
            System.out.println("Bill is " + bill);
            return;
        } else if (units> 300) {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
            System.out.println("Bill is " + bill);
            return;
            
        }
    }
}
