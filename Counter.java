import java.util.*;
public class Counter
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter jewels and stones");
    String jewels=in.nextLine();
    String stones=in.nextLine();
    int l1=jewels.length();
    int l2=jewels.length();
    if(l1>50 || l1<1 || l2>50 || l2<1 || jewels.chars().distinct().count()!=l1|| !(jewels.matches("^[a-zA-Z]+$"))|| !(stones.matches("^[a-zA-Z]+$")))
    {
      System.out.println("Invalid input");
      return;
    }
    int c=0;
    for(int i=0;i<l1;i++)
    {
      char ch=jewels.charAt(i);
      for(int j=0;j<l2;j++)
      {
        char ch1=stones.charAt(j);
        if(ch==ch1)
          c++;
      }
    }
    System.out.println("No. of stones that are jewels:"+c);
  }
}