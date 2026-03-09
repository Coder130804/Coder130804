import java.util.*;
public class Finance
{
  public static int finance()
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter no. of days and its stock prices");
    int n=in.nextInt();
    if(n<2 || n>100)
      return -999;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
   int g=-9999;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[j]-arr[i]>g && arr[i]<arr[j])
          g=arr[j]-arr[i];
      }
    }
    if(g<2)
      return 0;
    else
      return g;
  }
  public static void main(String args[])
  {
    System.out.println(finance());
  }
}