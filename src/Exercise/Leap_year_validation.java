package Exercise;
import java.util.Scanner;

public class Leap_year_validation
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the year");
        int a;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid year");
            return;
        }
        else if (sc.hasNextInt())
        {
            a= sc.nextInt();
            if(a%4==0)
            {
                System.out.println("The year " + a+ " is a leap year");
            }
            else
            {
                System.out.println("The year " + a+ " is not a leap year");
            }
        }
    }
}
