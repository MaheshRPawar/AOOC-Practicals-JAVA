import MathOperations.*;

class MathOperationsEx5_3
{
    public static void main(String[] args)
    {
        MathFunctions m = new MathFunctions();

        double num = 7.6;

        System.out.println("Floor: " + m.floorValue(num));
        System.out.println("Ceil: " + m.ceilValue(num));
        System.out.println("Round: " + m.roundValue(num));
    }
}
