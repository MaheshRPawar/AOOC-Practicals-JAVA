import java.util.Scanner;

class JavaBasicsDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 1. Printing Basic Information
        System.out.println("=== Basic Java Output ===");
        System.out.println("Name: Mahesh Pawar");
        System.out.println("Roll No: 85");
        System.out.println("Division: B");

        // 2. Variables Example
        System.out.println("\n=== Variables Example ===");

        String name = "Mahesh";
        int roll = 85;
        String division = "B";

        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Division: " + division);

        // 3. User Input Example
        System.out.println("\n=== User Input Example ===");

        System.out.print("Enter Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Roll: ");
        int userRoll = sc.nextInt();

        System.out.print("Enter Division: ");
        String userDiv = sc.next();

        System.out.println("\nEntered Details:");
        System.out.println("Name: " + userName);
        System.out.println("Roll: " + userRoll);
        System.out.println("Division: " + userDiv);

        // 4. One Dimensional Array
        System.out.println("\n=== 1D Array Example ===");

        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }

        // 5. Two Dimensional Array
        System.out.println("\n\n=== 2D Array Example ===");

        int matrix[][] = new int[2][2];

        System.out.println("Enter elements of 2x2 matrix:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix Elements:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}