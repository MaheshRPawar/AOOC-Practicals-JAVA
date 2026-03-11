import java.io.*;

class FileAnalysisEx7_3
{
    public static void main(String[] args)
    {
        int vowels = 0;
        int words = 0;
        int countA = 0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            String line;

            while((line = br.readLine()) != null)
            {
                words += line.split(" ").length;

                for(int i = 0; i < line.length(); i++)
                {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                        vowels++;

                    if(ch=='a')
                        countA++;
                }
            }

            br.close();

            System.out.println("Total Words: " + words);
            System.out.println("Total Vowels: " + vowels);
            System.out.println("Occurrences of 'a': " + countA);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
