class OddNumberException extends Exception
{
    OddNumberException(String msg)
    {
        super(msg);
    }
}

class OddNumberExceptionEx6_2
{
    static void checkNumber(int num) throws OddNumberException
    {
        if(num % 2 != 0)
        {
            throw new OddNumberException("Odd number entered");
        }
        else
        {
            System.out.println("Even number accepted");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkNumber(7);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
