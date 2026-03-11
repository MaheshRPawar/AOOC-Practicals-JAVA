import java.util.Scanner;

class MergeArraysEx1_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];

        System.out.println("Enter 5 sorted numbers for first array:");
        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 5 sorted numbers for second array:");
        for(int i = 0; i < 5; i++)
        {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0, k = 0;

        while(i < 5 && j < 5)
        {
            if(a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < 5)
        {
            c[k] = a[i];
            i++;
            k++;
        }

        while(j < 5)
        {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for(i = 0; i < 10; i++)
        {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}