class BankAccount
{
    double balance = 500;

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount)
    {
        balance = balance - amount;
        System.out.println("Amount Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount
{
    void withdraw(double amount)
    {
        if(balance - amount < 100)
        {
            System.out.println("Withdrawal not allowed. Minimum balance must be 100.");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

class BankAccountEx3_1
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount();

        s.deposit(200);
        s.withdraw(550);
        s.withdraw(100);
    }
}