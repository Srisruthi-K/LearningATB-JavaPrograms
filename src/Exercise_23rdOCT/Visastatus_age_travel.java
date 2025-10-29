package Exercise_23rdOCT;
import java.util.Scanner;

public class Visastatus_age_travel {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the age of the passenger");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid input for the age");
            return;
        }
        int age = sc.nextInt();
        if(age<=0)
        {
            System.out.println("Invalid input for the age.Should be non-zero postive integer");
            return;
        } else if (age<18) {
            System.out.println("Person not eligible for travel");
            return;
        }
        System.out.println("Enter the visa status as valid or invalid ");
        if(!sc.hasNext())
        {
            System.out.println("Enter valid status");
            return;
        }
        String visa_status = sc.next();
        sc.close();
        if(!(visa_status.equalsIgnoreCase("valid")) && !(visa_status.equalsIgnoreCase("invalid")) )
        {
            System.out.println("Enter valid visa status as either valid / invalid");
            return;
        } else if (age>= 18 && visa_status.equals("valid") )
        {
            System.out.println("Person is eligible for travel");
            return;
            
        } else if (age>=18 && visa_status.equals("invalid"))
        {

            System.out.println("Person is not eligible for travel");
            return;
        }
    }
}
