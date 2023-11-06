//File operations using CharacterStream and ByteStream

package files;
import java.util.*;
import java.io.*;
public class char_byte_stream_demo {
    public static void main(String[] args) throws IOException
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Binary File name:");
        String name = obj.nextLine();
        FileWriter fw = new FileWriter("Copied_file1.PNG");
        FileReader fr = new FileReader(name);
        int i;
        while((i=fr.read())!=-1)
        {
            fw.write(i);
        }
        fw.close();
        System.out.println(name+" had been copied successfully at Copied_file1 by using character stream.");
        FileInputStream fs = new FileInputStream(name);
        FileOutputStream fo = new FileOutputStream("Copied_file2.PNG");
        while((i=fs.read())!=-1)
        {
            fo.write(i);
        }
        System.out.println(name+" had been copied successfully at Copied_file2 by using Byte stream.");
    }
}
