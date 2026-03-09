import java.util.*;
class Packet
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f[]=new int[100001];
    int max=0;
    for(int i=0;i<n;i++)
      max=Math.max(max,++f[in.nextInt()]);
    System.out.println("Output:"+max);
  }
}