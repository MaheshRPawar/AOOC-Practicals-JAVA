import java.io.*;

class FileReadEx7_1
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fin = new FileInputStream("sample.txt");
            int ch;

            while((ch = fin.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fin.close();
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
