import java.io.*;
import java.io.FileReader;
public class BufferedReadWrite {
public static void main(String[] args) throws IOException{
 try {
 // Writing using BufferedWriter
 BufferedWriter writer = new BufferedWriter(new FileWriter("demo1.txt"));
 writer.write("This is a BufferedWriter example.");
 writer.newLine();
 writer.write("Second Line.");
 writer.close();
 System.out.println("Data written to file.");

 // Reading using BufferedReader
BufferedReader reader = new BufferedReader(new FileReader("demo1.txt"));
 String line;
 System.out.println("File Content:");
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 reader.close();
 } catch (IOException e) {
 System.out.println("Error: " + e.getMessage());
 }
 }
}