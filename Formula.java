import java.util.*;
class Formula
{
  static int gcd(int a,int b)
  {
    return b==0?a:gcd(b,a%b);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String f=in.nextLine();
    if(f.charAt(0)!='-')
      f="+"+f;
    String t[]=f.split("(?=[+-])");
    int n=0,d=1;
    for(String x:t)
    {
      if(x.isEmpty())
        continue;
      String p[]=x.split("/");
      int a1=Integer.parseInt(p[0]);
      int b1=Integer.parseInt(p[1]);
      n=n*b1+a1*d;
      d=d*b1;
      int g=gcd(Math.abs(n),d);
      n/=g;
      d/=g;
    }
    System.out.println(n+"/"+d);
  }
}