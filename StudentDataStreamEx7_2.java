import java.io.*;
import java.util.*;

class StudentDataStreamEx7_2
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            FileOutputStream fout = new FileOutputStream("student.txt");
            DataOutputStream dout = new DataOutputStream(fout);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            dout.writeUTF(name);
            dout.writeInt(age);
            dout.writeDouble(weight);
            dout.writeDouble(height);
            dout.writeUTF(city);
            dout.writeUTF(phone);

            dout.close();

            FileInputStream fin = new FileInputStream("student.txt");
            DataInputStream din = new DataInputStream(fin);

            System.out.println("\nStudent Data from File:");

            System.out.println("Name: " + din.readUTF());
            System.out.println("Age: " + din.readInt());
            System.out.println("Weight: " + din.readDouble());
            System.out.println("Height: " + din.readDouble());
            System.out.println("City: " + din.readUTF());
            System.out.println("Phone: " + din.readUTF());

            din.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
