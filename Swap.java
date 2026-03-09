import java.io.*;
class Swap 
{
    public static void main(String args[]) throws IOException
    {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a,b;
            System.out.println("Enter the first number:");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter the second number:");
            b = Integer.parseInt(br.readLine());
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
