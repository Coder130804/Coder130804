import java.util.*;
public class Marathon
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the no. of days");
    int n=in.nextInt();
    if(n<3 || n>100){
      System.out.println("No. must be between 3 and 100");
      return;
    }
    int scores[]=new int[n];
    System.out.println("Enter scores of each day");
    for(int i=0;i<n;i++)
      scores[i]=in.nextInt();
    int m=0;
    for(int i=0;i<n;i++)
    {
      if(i==0||i==(n-1))
        continue;
      else
      {
        if(scores[i]>scores[i-1] && scores[i]>scores[i+1])
        m++;
      }
    }
    System.out.println("No. of magical days="+m);
  }
}