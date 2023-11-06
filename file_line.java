//read file & display it with line number

package files;
import java.util.*;
import java.io.*;
public class file_demo {
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter File Path: ");
       String name = obj.nextLine();
       int i =1;
       try
       {
            FileReader file = new FileReader(name);
            BufferedReader fr = new BufferedReader(file);
            String line;
            while((line = fr.readLine())!=null)
            {
                System.out.println(i+" "+line);
                i+=1;
            }
        }
        catch(IOException e)
        {
            System.err.println("Error: File doesn't Exists!");
        }
    }
}
