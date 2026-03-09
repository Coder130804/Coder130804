import java.util.*;
class Game
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String n[]=in.nextLine().split(" ");
    int nums[]=new int[n.length];
    for(int i=0;i<n.length;i++)
      nums[i]=Integer.parseInt(n[i]);
    int k=in.nextInt();
    if(k<=0||n.length==0)
      return;
    int dp[]=new int[n.length];
    dp[0]=nums[0];
    for(int i=1;i<n.length;i++)
    {
      int max=Integer.MIN_VALUE;
      for(int j=1;j<=k && i-j>=0;j++)
        max=Math.max(max,dp[i-j]);
      dp[i]=max+nums[i];
    }
    System.out.println(dp[n.length-1]);
  }
}