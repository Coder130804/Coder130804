import java.util.*;
class Nebula
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<3||n>1000)
      return;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    int t=in.nextInt();
    int best=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    Arrays.sort(arr);
    for(int i=0;i<n-2;i++)
    {
      int l=i+1;
      int r=n-1;
      while(l<r)
      {
        int sum=arr[i]+arr[l]+arr[r];
        int d=Math.abs(sum-t);
        if(d<min||(d==min&&sum>best)){
          best=sum;
          min=d;
        }
        if(sum<t)
          l++;
        else
          r--;
      }
    }
    System.out.println(best);
  }
}