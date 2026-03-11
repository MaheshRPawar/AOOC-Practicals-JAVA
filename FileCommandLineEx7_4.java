import java.io.*;
import java.util.*;

class FileCommandLineEx7_4
{
    public static void main(String[] args)
    {
        try
        {
            String fileName = args[0];
            File file = new File(fileName);

            Scanner sc = new Scanner(System.in);

            if(file.exists())
            {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;

                System.out.println("File Contents:");

                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }

                br.close();

                System.out.print("Do you want to add data to the file? (yes/no): ");
                String choice = sc.nextLine();

                if(choice.equalsIgnoreCase("yes"))
                {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

                    System.out.println("Enter text (type 'exit' to stop):");

                    while(true)
                    {
                        String text = sc.nextLine();

                        if(text.equalsIgnoreCase("exit"))
                            break;

                        bw.write(text);
                        bw.newLine();
                    }

                    bw.close();
                }
            }
            else
            {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));

                System.out.println("File created. Enter data (type 'exit' to stop):");

                while(true)
                {
                    String text = sc.nextLine();

                    if(text.equalsIgnoreCase("exit"))
                        break;

                    bw.write(text);
                    bw.newLine();
                }

                bw.close();
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
