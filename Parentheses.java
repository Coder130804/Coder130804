import java.util.*;
public class Parentheses
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    if(s.length()<1||s.length()>1e4)
      return;
    StringBuilder res=new StringBuilder();
    int d=0;
    for(char c:s.toCharArray())
    {
      if(c=='(')
      {
        if(d++>0)
          res.append(c);
      }
      else
      {
        if(--d>0)
          res.append(c);
      }
    }
    System.out.println(res);
  }
}