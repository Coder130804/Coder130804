import java.util.*;
class Recursion
{
  static int dp[][]=new int[101][101];
  static int f(int n,int r)
  {
    if(r==0||r==n)
      return 1;
    if(dp[n][r]>0)
      return dp[n][r];
    return dp[n][r]=f(n-1,r)+f(n-1,r-1);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int r=in.nextInt();
    System.out.println("OUTPUT:"+f(n,r));
  }
}