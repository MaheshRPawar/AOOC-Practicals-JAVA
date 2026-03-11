class StaticDemo
{
    static int number;

    static
    {
        number = 10;
        System.out.println("Static Block Executed");
    }

    static void display()
    {
        System.out.println("Static Method Called");
        System.out.println("Number = " + number);
    }
}

class StaticDemoEx2_3
{
    public static void main(String[] args)
    {
        StaticDemo.display();
    }
}