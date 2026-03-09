import java.util.*;
public class Speech
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter sentence");
    String speechLine=in.nextLine().trim();
    String w[]=speechLine.split("\\s+");
    for(int i=w.length-1;i>=0;i--)
    {
      System.out.print(w[i]);
      if(i!=0)
        System.out.print(" ");
    }
    System.out.println();
    
  }
}