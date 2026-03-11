import ExceptionHandlingDemo.*;

class DivisionTestEx6_3
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        try
        {
            int result = c.divide(10,0);
            System.out.println("Result: " + result);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
