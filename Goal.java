import java.util.*;
public class Goal
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter target and session details");
    int t=in.nextInt();
    int n=in.nextInt();
    int session[]=new int[n];
    for(int i=0;i<n;i++)
      session[i]=in.nextInt();
    int start=0,end=0,sum=0;
    int minSess=Integer.MAX_VALUE;
    while(end<n)
    {
      sum= sum+session[end];
      while(sum>=t)
      {
        minSess=Math.min(minSess,end-start+1);
        sum=sum-session[start];
        start++;
      }
      end++;
    }
    if(minSess==Integer.MAX_VALUE)
      System.out.println("0");
    else
      System.out.println(minSess);
  }
}