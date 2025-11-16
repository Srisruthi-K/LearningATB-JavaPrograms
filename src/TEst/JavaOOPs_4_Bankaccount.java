package TEst;


public class JavaOOPs_4_Bankaccount {


        private String accountNumber;
        private String holderName;
        private double balance;

    JavaOOPs_4_Bankaccount(String accountNumber, String holderName, float balance)
        {
            this.accountNumber=accountNumber;
            this.balance=balance;
            this.holderName =holderName;

        }

        void deposit( double amountdeposit)
        {
            //Scanner sc = new Scanner(System.in);
            System.out.println("The amount deposited is " + amountdeposit);
            balance= balance+amountdeposit;
            //return sc.nextDouble();
        }
        void withdraw(double amountwithdraw)
        {
            if(amountwithdraw> balance)
            {
                System.out.println("Insufficient balance.Enter the correct amount to be withdrawn");
                return ;
            }
            else {
                System.out.println("The amount withdrawn is " + amountwithdraw);
                balance = balance-amountwithdraw;
            }
        }
        void displayBalance()
        {
            System.out.println("The balance amount is " + balance);

        }

        public static void main(String[] args) {
            JavaOOPs_4_Bankaccount b1= new JavaOOPs_4_Bankaccount("HDFC123", "Sruthi" , 1000);
            b1.deposit(500);
            b1.displayBalance();
            b1.withdraw(200);
            b1.displayBalance();
        }
    }



