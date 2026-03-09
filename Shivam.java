import java.util.*;
public class Shivam
{
  public static boolean prices()
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a budget greater than or equal to zero");
    int budget=in.nextInt();
    System.out.println("Enter a no. between 1 and 1000");
    int n=in.nextInt();
    int iceCreamPrices[]=new int[n];
    System.out.println("Enter "+n+" no. of prices between 1 and 10000");
    for(int i=0;i<n;i++)
      iceCreamPrices[i]=in.nextInt();
    for(int i=0;i<n;i++)
    {
      if(budget==iceCreamPrices[i])
        return true;
    }
    return false;
    }
  public static void main(String args[])
  {
    System.out.println(prices());
  }
}