import java.util.*;
class Sort1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<3||n>1000)
      return;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int t=in.nextInt();
    Arrays.sort(a);
    for(int i=0;i<n-2;i++)
    {
      int l=i+1,r=n-1;
      while(l<r)
      {
         int sum=a[i]+a[l]+a[r];
         if(sum==t)
         {
           System.out.println("true");
           return;
         }
        if(sum<t)
          l++;
        else
          r--;
      }
    }
    System.out.println("false");
  }
}