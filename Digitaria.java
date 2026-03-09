import java.util.*;
class Digitaria
{
  static int f(int i,int n)
  {
    if(i==n)
      return 1;
    return (i%2==0?5:4)*f(i+1,n);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(f(0,n));
  }
}