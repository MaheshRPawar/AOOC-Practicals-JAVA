class LowBalanceException extends Exception
{
    LowBalanceException(String msg)
    {
        super(msg);
    }
}

class NegativeNumberException extends Exception
{
    NegativeNumberException(String msg)
    {
        super(msg);
    }
}

class BankAccount
{
    double balance = 1000;

    void balanceEnquiry()
    {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException
    {
        if(amount < 0)
        {
            throw new NegativeNumberException("Cannot deposit negative amount");
        }

        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException
    {
        if(amount < 0)
        {
            throw new NegativeNumberException("Cannot withdraw negative amount");
        }

        if(amount > balance)
        {
            throw new LowBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
}

class BankExceptionEx6_1
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();

        try
        {
            b.balanceEnquiry();
            b.deposit(500);
            b.withdraw(2000);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
