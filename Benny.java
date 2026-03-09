import java.util.*;
class Benny
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    Set<String> set=new HashSet<>();
    int x=0,y=0,ans=0;
    set.add("0,0");
    for(char c:s.toCharArray())
    {
      if(c=='L')
        x--;
      else if(c=='R')
        x++;
      else if(c=='U')
        y++;
      else
        y--;
      String p=x+","+y;
      if(!set.add(p))
        ans++;
    }
    System.out.println(ans);
  }
}