import java.io.*;
class FileWriteDemo {
public static void main(String[] args) throws IOException
 {
 PrintWriter pw = new PrintWriter("data.txt");
 pw.println("Hello Java");
 pw.println(10 + 20 + "Hello Java");
 pw.println(true);
 pw.close(); 
  }
}