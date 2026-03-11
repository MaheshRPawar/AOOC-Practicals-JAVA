import java.util.Scanner;

class MatrixOperationsEx1_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("Enter elements of Matrix A:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("1.Addition 2.Multiplication 3.Transpose A 4.Transpose B");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:

                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        C[i][j] = A[i][j] + B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:

                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:

                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        System.out.print(A[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            case 4:

                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        System.out.print(B[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}