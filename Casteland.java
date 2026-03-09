import java.util.*;
class Castleland
{
  static void dfs(int u,List<List<Integer>> g,boolean v[],List<Integer> r)
  {
    v[u]=true;
    r.add(u);
    for(int x:g.get(u))
      if(!v[x])
        dfs(x,g,v,r);
  }
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
    boolean v[]=new boolean[n];
    List<Integer> r=new ArrayList<>();
    dfs(0,g,v,r);
    System.out.println(r);
  }
}