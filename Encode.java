import java.util.*;
class Encode
{
  static int i;
  static String f(String s)
  {
    StringBuilder r=new StringBuilder();
    while(i<s.length())
    {
      char c=s.charAt(i++);
      if(Character.isDigit(c))
      {
        int k=c-'0';
        while(i<s.length()&&Character.isDigit(s.charAt(i)))
          k=k*10+s.charAt(i++)-'0';
        i++;
        String t=f(s);
        while(k-- >0)
          r.append(t);
      }
      else if(c==']')
        return r.toString();
      else
        r.append(c);
    }
    return r.toString();
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    i=0;
    System.out.println("Output:"+f(s));
  }
}