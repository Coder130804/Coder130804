import java.util.*;
class Series
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    double r=1.0/3;
    double sum=(1-Math.pow(r,n))/(1-r);
    System.out.printf("%.5f",sum);
  }
}