import java.util.*;
class Fix
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String t[]=in.nextLine().split(" ");
    int n=t.length;
    int dup=-1,miss=-1;
    int f[]=new int[n+1];
    for(String s:t)
      f[Integer.parseInt(s)]++;
    for(int i=1;i<=n;i++)
    {
      if(f[i]==2)
        dup=i;
      if(f[i]==0)
        miss=i;
    }
    System.out.println("["+dup+","+miss+"]");
  }
}