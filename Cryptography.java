import java.util.*;
class Crytographer
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String t=in.nextLine();
    if(s.length()!=t.length())
    {
      System.out.println("False");
      return;
    }
    Map<Character,Character> m=new HashMap<>();
    Map<Character,Character> r=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
      char x=s.charAt(i);
      char y=s.charAt(i);
      if(m.containsKey(x)&&m.get(x)!=y||r.containsKey(y)&&r.get(y)!=x)
      {
        System.out.println("False");
        return;
      }
      m.put(x,y);
      r.put(y,x);
    }
    System.out.println("True");
  }
}