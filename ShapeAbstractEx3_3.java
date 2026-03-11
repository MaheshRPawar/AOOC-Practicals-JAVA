abstract class Shape
{
    double dim1;
    double dim2;

    abstract void area();
}

class Rectangle extends Shape
{
    void area()
    {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Shape
{
    void area()
    {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

class ShapeAbstractEx3_3
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.dim1 = 10;
        r.dim2 = 5;
        r.area();

        Triangle t = new Triangle();
        t.dim1 = 8;
        t.dim2 = 4;
        t.area();
    }
}