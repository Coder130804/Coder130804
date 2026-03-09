import java.util.*;
class Algebrus
{
  static boolean isPower(int n)
  {
    if(n==1)
      return true;
    if(n<1||n%2!=0)
      return false;
    return isPower(n/2);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(isPower(n));
  }
}