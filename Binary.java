import java.util.*;
class Binary
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String b=in.next();
    int one=0,op=0;
    for(char c:b.toCharArray())
    {
      if(c=='1')
        one++;
      else
        op=op+one;
    }
    System.out.println(op/2);
  }
}