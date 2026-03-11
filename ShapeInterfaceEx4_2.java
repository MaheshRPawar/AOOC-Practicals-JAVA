interface Shape
{
    void area();
}

class Rectangle implements Shape
{
    int length = 10;
    int breadth = 5;

    public void area()
    {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle implements Shape
{
    int base = 8;
    int height = 4;

    public void area()
    {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

class ShapeInterfaceEx4_2
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        r.area();
        t.area();
    }
}

