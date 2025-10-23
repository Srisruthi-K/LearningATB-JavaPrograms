package Exercise;
import java.util.Scanner;

public class ATM_Withdraw {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn");
        int Acc_bal=10000;
        int new_acc_bal;
        if(!sc.hasNextInt())
        {
            System.out.println("Enter a valid input");
        }
        else {
            int amount_withdraw=sc.nextInt();
            if(amount_withdraw > 0 && amount_withdraw %100==0 && amount_withdraw <= Acc_bal)
            {
                new_acc_bal= Acc_bal-amount_withdraw;
                System.out.println("The new balance amount after withdraw is " + new_acc_bal);
            }
            else
            {
                System.out.println("Withdraw failed.Enter a valid amount greater than 0, in multiples of 100 less than the account balance");
            }
        }

    }
}
