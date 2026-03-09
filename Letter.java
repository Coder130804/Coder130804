import java.util.*;
class Letter
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    String t="a";
    while(t.length()<n)
    {
      StringBuilder b=new StringBuilder();
      for(char c:t.toCharArray())
        b.append((char)(c=='z'?'a':c+1));
      t=t+b;
    }
    System.out.println((char)(t.charAt(n-1)-32));
  }
}