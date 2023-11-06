//Information about the file

import java.io.*;
import java.util.*;
public class Files {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter File Path: ");
       String name = obj.nextLine();
       File f = new File(name);
       if(f.exists())
       {
           System.out.println(name+" - File Exists!");
           System.out.println("Readable?: "+f.canRead());
           System.out.println("Writable?: "+f.canWrite());
           int index = name.lastIndexOf('.');
           if(index>0)
           {
               String exten = name.substring(index+1);
               System.out.println("File type: "+exten);
           }
           else 
               System.out.println("File Type: Unknown");
           System.out.println("Length of file in bytes: "+f.length());
       }
       else
           System.out.println(name +" - File doesn't Exists!");
    }   
}
