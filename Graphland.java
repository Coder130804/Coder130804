import java.util.*;
import java.util.LinkedList;
class Graphland
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    String rows[]=in.nextLine().replaceAll("[^0-9\\[\\],]","").split("],\\[");
    List<List<Integer>> g=new ArrayList<>();
    for(String r:rows)
    {
      List<Integer> l=new ArrayList<>();
      for(String s:r.replaceAll("[\\[\\]]","").split(","))
        if(!s.isEmpty())
          l.add(Integer.parseInt(s));
      g.add(l);
    }
    boolean vis[]=new boolean[n];
    Queue<Integer> q=new LinkedList<>();
    List<Integer> res=new ArrayList<>();
    q.add(0);
    vis[0]=true;
    while(!q.isEmpty())
    {
      int u=q.poll();
      res.add(u);
      for(int v:g.get(u))
        if(!vis[v])
        {
          vis[v]=true;
          q.add(v);
        }
    }
    System.out.println(res);
  }
}