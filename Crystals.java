import java.util.*;
class Crystals
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n<2||n>1e5)
      return;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    long left[]=new long[n];
    long right[]=new long[n];
    left[0]=1;
    right[n-1]=1;
    for(int i=1;i<n;i++)
      left[i]=left[i-1]*arr[i-1];
    for(int i=n-2;i>=0;i--)
      right[i]=right[i+1]*arr[i+1];
    for(int i=0;i<n;i++)
      System.out.print((left[i]*right[i])+" ");
  }
}