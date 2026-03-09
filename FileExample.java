import java.io.*;
public class FileExample 
{
public static void main(String[] args) throws IOException
{
 try {
 File myFile = new File("demo.txt");
 
 // File create
 if (myFile.createNewFile()) {
 System.out.println("File created: " + myFile.getName());
 } else {
 System.out.println("File already exists.");
 }
 
 // File properties check
 System.out.println("Readable: " + myFile.canRead());
 System.out.println("Writable: " + myFile.canWrite());
 System.out.println("Size: " + myFile.length() + " bytes");

 // File delete
 if (myFile.delete()) {
 System.out.println("File deleted successfully.");
 } else {
 System.out.println("Failed to delete file.");
 }
 
 } 
 catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }
}
 
