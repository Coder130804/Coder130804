import java.io.*;
public class FileReadWrite {
public static void main(String[] args) throws IOException{
 try {
 // Writing to file
 FileWriter writer = new FileWriter("demo.txt");
 writer.write("Hello, Java File Handling!");
 writer.close();
 System.out.println("Data written to file.");
 // Reading from file
 FileReader reader = new FileReader("demo.txt");
 int ch;
System.out.print("File Content: ");
 while ((ch = reader.read()) != -1) {
 System.out.print((char) ch);
 }
 reader.close();
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}