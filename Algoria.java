import java.util.*;
class Algoria
{
  static double f(double x,int n)
  {
    if(n==0)
      return 1;
    double r=f(x,n/2);
    r=r*r;
    return n%2==0?r:(n<0?1/x:x)*r;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    double x=in.nextDouble();
    int n=in.nextInt();
    System.out.printf("%.5f",f(x,n));
  }
}