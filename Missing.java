import java.util.*;
class Missing
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int s=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
      s=s+arr[i];
    }
    System.out.println(n*(n+1)/2-s);
  }
}