import java.util.*;
import java.util.LinkedList;
class Dota
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine().trim();
    if(s.length()<1||s.length()>10000||!s.matches("[RD]+"))
    {
      System.out.println("Invalid input");
      return;
    }
    Queue<Integer> r=new LinkedList<>();
    Queue<Integer> d=new LinkedList<>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='R')
        r.add(i);
      else
        d.add(i);
    }
    while(!r.isEmpty() && !d.isEmpty())
    {
      int ri=r.poll();
      int di=d.poll();
      if(ri<di)
        r.add(ri+n);
      else
        d.add(di+n);
    }
    System.out.println(r.isEmpty()? "Dire":"Radiant");
  }
}