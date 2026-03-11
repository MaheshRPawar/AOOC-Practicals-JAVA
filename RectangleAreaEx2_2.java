import java.util.Scanner;

class Area
{
    int length;
    int breadth;

    void setDim(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int getArea()
    {
        return length * breadth;
    }
}

class RectangleAreaEx2_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Area rect = new Area();

        System.out.print("Enter Length: ");
        int l = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();

        rect.setDim(l,b);

        System.out.println("Area of Rectangle = " + rect.getArea());

        sc.close();
    }
}